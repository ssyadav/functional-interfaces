package com.satya.consumers;

import java.util.function.Consumer;

// Consumer<T> is a functional interface, and it has only one abstract method accept
// Consumer<T> represents an operation that accepts a single input argument and returns no result.
public class CunsumerDemo1 {

    public static void main(String[] args){
        // Consumer to print the input
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello");

        // Consumer to print the length of the input
        Consumer<String> printLength = str -> System.out.println(str.length());
        printLength.accept("Hello");
        printLength.accept("Hello world");
    }
}
