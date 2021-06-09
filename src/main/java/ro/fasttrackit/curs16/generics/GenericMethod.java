package ro.fasttrackit.curs16.generics;

public class GenericMethod {
    public <T extends Number> double returnT(T input){
        return input.doubleValue();
    }
}
