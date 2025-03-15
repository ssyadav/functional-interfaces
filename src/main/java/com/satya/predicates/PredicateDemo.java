package com.satya.predicates;

import java.util.function.Predicate;

// Predicate is a functional interface which takes an argument and returns a boolean value.
public class PredicateDemo {

    public static void main(String[] args){
        // Predicate to check if a number is greater than 10
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(100)); // true
        System.out.println(p.test(5)); // false

        // Predicate to check the length of a string is greater than 5
        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        System.out.println(lengthGreaterThan5.test("Hello")); // false
        System.out.println(lengthGreaterThan5.test("Hello World")); // true

        String strArray[] = {"Hello", "World", "Java", "Predicate", "Functional", "Interface"};

        for(String str : strArray) {
            if(lengthGreaterThan5.test(str)){
                System.out.println(str);
            }
        }
    }
}
