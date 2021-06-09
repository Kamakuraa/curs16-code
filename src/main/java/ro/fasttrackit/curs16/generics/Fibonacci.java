package ro.fasttrackit.curs16.generics;

public class Fibonacci {
    public int fib(int n) {
        if (n<0){
            throw new IllegalArgumentException("please provide positive number");
        }
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
