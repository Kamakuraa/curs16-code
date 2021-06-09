package ro.fasttrackit.curs16.generics.temaRefacutaEx2;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


class PersonServiceTest {
    @Test
    @DisplayName("When")
    void emptyPersonList() {
        // SETUP
        PersonService service = new PersonService(List.of());

        // RUN
        Optional<Person> result = service.getPersonById(1);

        // ASSERT
        assertThat(result).isEmpty();

    }


    @Test
    @DisplayName("When request an existing person Then the person is returned")
    void existingPerson() {

        PersonService service = populateService();

        Optional<Person> result = service.getPersonById(3);

        assertThat(result).isNotEmpty();

        assertThat(result.get())
                .extracting("id", "age", "name")
                .containsExactly(2, 22, "Ana");

    }

    @Test
    @DisplayName("When request a missing person Then empty is returned")
    void missingPerson() {
        PersonService service = populateService();

        Optional<Person> result = service.getPersonById(33);

        assertThat(result).isEmpty();
    }

    @Test
    @DisplayName("When a person is edit Then it can be returned")
    void addPerson(){
        PersonService service = populateService();
        Person person = new Person(0, 33, "Cris");

        Optional<Person> result = service.addPerson(person);

        assertThat(result).isNotEmpty();

        assertThat(result.get().id()).isEqualTo(5);



    }

    private PersonService populateService() {
        return new PersonService(List.of(
                new Person(1, 22, "Ana"),
                new Person(2, 22, "Ana"),
                new Person(3, 22, "Ana"),
                new Person(4, 22, "Ana")
        ));
    }


}