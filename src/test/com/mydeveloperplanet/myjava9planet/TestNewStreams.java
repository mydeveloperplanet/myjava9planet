package com.mydeveloperplanet.myjava9planet;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestNewStreams  {

    private static final String[] FROM_PINEAPPLE = {"pineapple", "orange"};

    private static final String[] UP_TO_PINEAPPLE = {"apple", "lemon"};

    private static final String[] EMPTY_ARRAY = {};

    private static final int[] ITERATE_ARRAY = {0, 2, 4, 6, 8};

    @Test
    public void testJava9DropWhile() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9DropWhile();
        Assert.assertArrayEquals(FROM_PINEAPPLE, fruits.toArray());
    }

    @Test
    public void testJava9TakeWhile() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9TakeWhile();
        Assert.assertArrayEquals(UP_TO_PINEAPPLE, fruits.toArray());
    }

    @Test
    public void testJava9Iterate() {
        NewStreams newStreams = new NewStreams();
        IntStream ints = newStreams.java9Iterate();
        Assert.assertArrayEquals(ITERATE_ARRAY, ints.toArray());
    }

    @Test
    public void testJava9OfNullable1() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9OfNullable1();
        Assert.assertArrayEquals(FROM_PINEAPPLE, fruits.toArray());
    }

    @Test(expected=NullPointerException.class)
    public void testJava9OfNullable2() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9OfNullable2();
        Assert.assertArrayEquals(FROM_PINEAPPLE, fruits.toArray());
    }

    @Test
    public void testJava9OfNullable3() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9OfNullable3();
        Assert.assertArrayEquals(FROM_PINEAPPLE, fruits.toArray());
    }

    @Test
    public void testJava9OfNullable4() {
        NewStreams newStreams = new NewStreams();
        Stream<String> fruits = newStreams.java9OfNullable4();
        Assert.assertArrayEquals(EMPTY_ARRAY, fruits.toArray());
    }

}
