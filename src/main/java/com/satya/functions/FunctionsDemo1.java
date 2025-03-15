package com.satya.functions;

import java.util.function.Function;

// Function<T, R> is a functional interface, and it has only one abstract method apply
// Function<T, R> represents a function that accepts one argument and produces a result.
// where T is the type of the input to the function, and R is the type of the result of the function.
public class FunctionsDemo1 {
    public static void main(String[] args){
        // Function to convert String to Integer
        Function<String, Integer> function = str -> Integer.parseInt(str);
        System.out.println(function.apply("123")); // 123


        // Function to take and string and returns the length of the string
        Function<String, Integer> calculateLength = str -> str.length();

        System.out.println(calculateLength.apply("Hello")); // 5
        System.out.println(calculateLength.apply("Hello world")); // 11
    }
}
