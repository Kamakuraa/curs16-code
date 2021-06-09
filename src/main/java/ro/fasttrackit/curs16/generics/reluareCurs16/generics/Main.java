package ro.fasttrackit.curs16.generics.reluareCurs16.generics;

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
        Integer intValue = 1;
        System.out.println(genericMethod.convertToDouble(intValue));
        Float floatValue = 1.1F;
        System.out.println(genericMethod.convertToDouble(floatValue));
    }

    private static void withPair() {
        Pair<String, Integer> nameToGrade = new Pair<>("Ana", 19);
        Pair<Person, Double> personDoublePair = new Pair<>(new Person("Mihai"), 0.9);

        System.out.println(nameToGrade);
        System.out.println(personDoublePair);
        System.out.println(personDoublePair.isPositive());
    }

    private static void withLimitedBox() {
//        LimitedBox<String> stringLimitedBox = new LimitedBox<String>("");
        LimitedBox<Integer> integerLimitedBox = new LimitedBox<Integer>(1);
        LimitedBox<Float> floatLimitedBox = new LimitedBox<Float>(1.1F);

    }

    private static void withGenericBox() {
        GenericBox<String> stringGenericBox = new GenericBox<>("Ana");
        GenericBox<Integer> integerGenericBox = new GenericBox<>(1);
        GenericBox<Double> doubleGenericBox = new GenericBox<>(1.1);
        GenericBox<Person> personGenericBox = new GenericBox<>(new Person("Mihai"));

        String object = stringGenericBox.getObject();
        Person person = personGenericBox.getObject();
        System.out.println(person.name());
    }

    private static void withSimpleBox() {
        Box stringBox = new Box("Ana");
        Box intBox = new Box(1);
        Box doubleBox = new Box(1.1);

        Box personBox = new Box(new Person("Marius"));

        System.out.println(stringBox);
        System.out.println(intBox);
        System.out.println(doubleBox);

        stringBox.getObject();

        play(stringBox);
        play(personBox);
    }

    private static void play(Box box) {
        Object object = box.getObject();
    }
}


record Person(String name) {
}