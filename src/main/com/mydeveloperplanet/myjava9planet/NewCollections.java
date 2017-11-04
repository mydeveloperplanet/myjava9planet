package com.mydeveloperplanet.myjava9planet;

import java.util.*;

/**
 * Try out the new Java 9 stuff about Collections
 */
public class NewCollections {

    public Set<String> java8UnmodifiebleSet() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("lemon");
        set.add("pineapple");
        set = Collections.unmodifiableSet(set);
        return set;
    }

    public Set<String> java9ImmutableSet() {
        return Set.of("apple", "lemon", "pineapple");
    }

    public List<String> java9ImmutableList() {
        return List.of("apple", "lemon", "pineapple");
    }

    public Map<Integer, String> java9ImmutableMap() {
        return Map.of(1, "apple", 2, "lemon", 3, "pineapple");
    }

    public Map<Integer, String> java9ImmutableVarargsMap() {
        Map.Entry<Integer, String> entry1 = Map.entry(1, "apple");
        Map.Entry<Integer, String> entry2 = Map.entry(2, "lemon");
        Map.Entry<Integer, String> entry3 = Map.entry(3, "pineapple");
        return Map.ofEntries(entry1, entry2, entry3);
    }

}
