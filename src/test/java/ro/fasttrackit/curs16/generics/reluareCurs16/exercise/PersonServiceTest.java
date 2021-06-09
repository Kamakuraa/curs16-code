package ro.fasttrackit.curs16.generics.reluareCurs16.exercise;

import org.assertj.core.api.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class PersonServiceTest {
    @Test
    @DisplayName("When no persons are in the service Then no person is found")
    void emptyPersonList() {
        //SETUP
        PersonService service = new PersonService(List.of());
        // RUN
        Optional<Person> result = service.getPersonById(1);
        //ASSERT
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("When request an existing person THen the person is returned")
    void existingPerson() {
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.getPersonById(3);
        //ASSERT
        assertThat(result).isNotEmpty();
        assertThat(result.get())
                .extracting("id", "name", "age")
                .containsExactly(3, "Sorin", 32);
    }

    @NotNull
    private PersonService populateService() {
        PersonService service = new PersonService(List.of(
                new Person(1, "Ana", 22),
                new Person(2, "Marius", 52),
                new Person(3, "Sorin", 32),
                new Person(4, "Bianca", 31)
        ));
        return service;
    }

    @Test
    @DisplayName("When request a missing person Then empty is returned")
    void missingPerson() {
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.getPersonById(33);
        //ASSERT
        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("When a person is added THEN it can be returned")
    void addPerson() {
        PersonService service = populateService();
        //RUN
        Optional<Person> result = service.addPerson(new Person(0, "Alex", 35));
        //ASSERT
        assertThat(result).isNotEmpty();
        assertThat(result.get().id());
        assertThat(service.getPersonById(5)).isNotEmpty();


    }
}