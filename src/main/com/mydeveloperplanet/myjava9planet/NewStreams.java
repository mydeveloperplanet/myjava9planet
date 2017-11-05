package com.mydeveloperplanet.myjava9planet;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Try out the new Java 9 stuff about Streams
 */
public class NewStreams {

    public Stream<String> java9DropWhile() {
        Stream<String> fruits = Stream.of("apple", "lemon", "pineapple", "orange").dropWhile(s -> !s.equals("pineapple"));
        return fruits;
    }

    public Stream<String> java9TakeWhile() {
        Stream<String> fruits = Stream.of("apple", "lemon", "pineapple", "orange").takeWhile(s -> !s.equals("pineapple"));
        return fruits;
    }

    public IntStream java9Iterate() {
        return IntStream.iterate(0, x -> x < 10, x -> x + 2);
    }

    public void java9OfNullable1() {
        Customer customer = new Customer();
        Stream.of(customer).flatMap(Customer::fruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable2() {
        Customer customer = null;
        Stream.of(customer).flatMap(Customer::fruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable3() {
        Customer customer = new Customer();
        Stream.ofNullable(customer).flatMap(Customer::fruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

    public void java9OfNullable4() {
        Customer customer = null;
        Stream.ofNullable(customer).flatMap(Customer::fruits).dropWhile(s -> !s.equals("pineapple")).forEach(System.out::println);
    }

}
