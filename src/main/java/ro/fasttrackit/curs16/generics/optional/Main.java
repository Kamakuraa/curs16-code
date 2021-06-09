package ro.fasttrackit.curs16.generics.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = getName();
        System.out.println(name.length());

        Optional<String > optional = getNameSafe();
        if (optional.isPresent()){
            System.out.println(optional.get().length());
        }else {
            System.out.println(0);
        }
        System.out.println(optional.orElse("nu avem nume"));
    }
    private static Optional <String> getNameSafe() {
        if (System.currentTimeMillis() % 2 == 0){
            return Optional.empty();
        } else {
            return Optional.of("name");
        }
    }
    private static String getName() {
        if (System.currentTimeMillis() % 2 == 0){
            return null;
        } else {
            return "name";
        }
    }
}
