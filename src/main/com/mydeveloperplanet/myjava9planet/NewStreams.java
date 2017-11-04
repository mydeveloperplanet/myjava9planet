package com.mydeveloperplanet.myjava9planet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Try out the new Java 9 stuff about Streams
 */
public class NewStreams {

    public void java9DropWhile() {
        Stream.of("apple", "lemon", "pineapple", "orange").dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9TakeWhile() {
        Stream.of("apple", "lemon", "pineapple", "orange").takeWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9Iterate() {
        IntStream.iterate(0, x -> x < 10, x -> x + 2).forEach(System.out::println);
    }

    public void java9OfNullable1() {
        Customer customer = new Customer();
        Stream.of(customer).flatMap(Customer::getFruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable2() {
        Customer customer = null;
        Stream.of(customer).flatMap(Customer::getFruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable3() {
        Customer customer = new Customer();
        Stream.ofNullable(customer).flatMap(Customer::getFruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable4() {
        Customer customer = null;
        Stream.ofNullable(customer).flatMap(Customer::getFruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

}
