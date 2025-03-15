package com.satya.functions;

import java.util.function.Function;

// Function<T,R> Chaining
// andThen() and compose() methods are used to chain multiple functions
public class FunctionsChaining {

    public static void main(String[] args){
        // Function to multiply the input by 2
        Function<Integer, Integer> multiplyBy2 = num -> num * 2;
        // Function to qube the input
        Function<Integer, Integer> qube = num -> num * num * num;

        // andThen() method is used to chain multiple functions
        // multiplyBy2.andThen(qube) will first multiply the input by 2 and then qube the result
        System.out.println(multiplyBy2.andThen(qube).apply(2)); // 64

        // compose() method is used to chain multiple functions
        // multiplyBy2.compose(qube) will first qube the input and then multiply the result by 2
        System.out.println(multiplyBy2.compose(qube).apply(2)); // 16
    }
}
