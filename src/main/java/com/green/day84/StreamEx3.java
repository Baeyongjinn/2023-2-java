package com.green.day84;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx3 {
    public static void main(String[] args) {
        Stream.iterate(0,item -> item + 3).mapToInt(Integer::intValue).skip(3).limit(10).boxed().forEach(System.out::println);
    }
}
