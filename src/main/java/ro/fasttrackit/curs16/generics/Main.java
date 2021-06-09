package ro.fasttrackit.curs16.generics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        withSimpleBox();

        withGenericBox();

        withLimitedBox();

        withPair();

        withGenericMethod();

    }

    private static void withGenericMethod() {
        GenericMethod genericMethod = new GenericMethod();
        Integer integer = 1;
        System.out.println(genericMethod.returnT(integer));
        Float floatVal = 2.3F;
        System.out.println(genericMethod.returnT(floatVal));
    }

    private static void withPair() {
        Pair<String, Integer> name = new Pair<>("Ana", 10);
        Pair<Person, Double> nameD = new Pair<>(new Person("Mihai" ),1.11);

        System.out.println(name);
        System.out.println(name.isPositive());
        System.out.println(nameD);
        System.out.println(nameD.isPositive());
    }

    private static void withLimitedBox() {
//        LimitedBox<String >stringLimitedBox = new LimitedBox<String>("");
        LimitedBox<Integer> integerLimitedBox = new LimitedBox<>(1);
        LimitedBox<Float> floatLimitedBox = new LimitedBox<>(1.2F);
    }

    private static void withGenericBox() {
        GenericBox<String> stringGenericBox = new GenericBox<>("Ana");
        GenericBox<Integer> intBox = new GenericBox<>(1);
        GenericBox<Double> doubleGenericBox = new GenericBox<>(12.1);
        GenericBox<Person> personGenericBox = new GenericBox<>(new Person("Mihai"));

        System.out.println(personGenericBox);
        String obj = stringGenericBox.getObject();
        Person person = personGenericBox.getObject();
        System.out.println(person.name());

    }

    private static void withSimpleBox() {
        Box stringBox = new Box("Ana");
        Box intBox = new Box(1);
        Box doubleBox = new Box(1.11);
        Box personBox = new Box(new Person("MArius"));
        System.out.println(stringBox);
        System.out.println(intBox);
        System.out.println(doubleBox);
        System.out.println(personBox);

        play(stringBox);
    }

    private static void play(Box box) {
        Object obj = box.getOject();
        // se pierde info legata de tipu; obiectului din box

    }
}

record Person(String name) {
}

