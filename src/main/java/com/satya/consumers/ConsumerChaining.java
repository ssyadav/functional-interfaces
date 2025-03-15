package com.satya.consumers;

import java.util.function.Consumer;

// Consumer<T> Chaining
public class ConsumerChaining {

    public static void main(String[] args){

        // Consumer to print the input
        Consumer<String> consumer = str -> System.out.println(str);

        // Consumer to print the length of the input
        Consumer<String> printLength = str -> System.out.println(str.length());

        // Consumer to reverse the input
        Consumer<String> reverse = str -> {
            StringBuilder sb = new StringBuilder(str);
            System.out.println(sb.reverse());
        };

        // Chaining two consumers
        // consumer.andThen(printLength) will first print the input and then print the length of the input
        consumer.andThen(printLength).accept("Hello");

        // Chaining three consumers
        // consumer.andThen(printLength).andThen(reverse).accept("Hello"); will first print the input, then print the length of the input and then reverse the input
        consumer.andThen(printLength).andThen(reverse).accept("Hello");

        // Chaining consumers and storing it in a variable
        Consumer<String> consumerOfConsumer = consumer.andThen(printLength).andThen(reverse);
        consumerOfConsumer.accept("Hello");

    }
}
