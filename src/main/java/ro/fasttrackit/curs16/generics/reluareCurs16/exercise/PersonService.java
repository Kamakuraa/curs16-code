package ro.fasttrackit.curs16.generics.reluareCurs16.exercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

record Person(int id, String name, int age) {
}

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> addPerson(Person person) {
        int id = getMaxId();
        Person newPerson = new Person(id+1, person.name(), person.age());
        persons.add(newPerson);
        return Optional.of(newPerson);
    }

    private int getMaxId() {
        int maxId = 0;
        for (Person person : persons) {
            if (person.id() > maxId) {
                maxId = person.id();
            }
        }
        return maxId;
    }
}
