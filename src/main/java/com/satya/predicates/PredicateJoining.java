package com.satya.predicates;

import java.util.function.Predicate;

/**
 * Predicate Joining - and, or, negate Predicate interface provides three default methods and(),
 * or() and negate() to combine multiple predicates. Predicate 1: Check if a number is greater than
 * 10 Predicate 2: Check if a number is even
 */
public class PredicateJoining {
  public static void main(String[] args) {
    // Predicate to check if a number is greater than 10
    Predicate<Integer> p1 = i -> i > 10;

    // Predicate to check if a number is even
    Predicate<Integer> p2 = i -> i % 2 == 0;

    int arr[] = {5, 10, 15, 20, 25, 30};

    System.out.println("Numbers greater than 10 and even");
    for (int num : arr) {
      if (p1.and(p2).test(num)) {
        System.out.println(num);
      }
    }

    System.out.println("Numbers greater than 10 or even");
    for (int num : arr) {
      if (p1.or(p2).test(num)) {
        System.out.println(num);
      }
    }

    System.out.println("Numbers not greater than 10");
    for (int num : arr) {
      if (p1.negate().test(num)) {
        System.out.println(num);
      }
    }
  }
}
