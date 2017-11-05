package com.mydeveloperplanet.myjava9planet;

import java.util.stream.Stream;

public class Customer {

    public Stream<String> fruits() {
        return Stream.of("apple", "lemon", "pineapple", "orange");
    }

}
