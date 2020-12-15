package com.maximalus;

import java.util.function.Consumer;

/**
 * @author Maksym Matlo
 */

public class HelloWorld {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hello world");
    }
}
