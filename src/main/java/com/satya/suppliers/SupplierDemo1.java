package com.satya.suppliers;

import java.util.Date;
import java.util.function.Supplier;

// Supplier is a functional interface, and it has a single method called get() which returns a value.
// Supplier - it does not take anu input, but it returns a value.
// Supplier is used to generate or supply values without taking any input.
public class SupplierDemo1 {

    public static void main(String[] args){
        // Supplier to generate a random number
        Supplier<Integer> random = () -> (int) (Math.random() * 1000);
        System.out.println(random.get());

        // Supplier to generate a constant value
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        // Supplier to return date
        Supplier<Date> dateSupplier = () -> new Date();
        System.out.println(dateSupplier.get());
    }
}
