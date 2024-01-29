package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Integer[] integerArr = {50, 10, 2, 22, 80, 90, 33};
        int[] intArr = {50, 10, 2, 22, 80, 90, 33};
//        Stream<Integer> stream1 = Arrays.stream(intArr).boxed();
        Stream<Integer> stream2 = Stream.of(integerArr);
        Stream<Integer> stream1 = IntStream.of(intArr).boxed();
        stream1 = stream1.sorted()
                .limit(3);

        List<Integer> list = stream1.collect(Collectors.toList());
        System.out.println("-------------");
        IntStream.of(intArr).boxed()
                            .sorted()
                            .limit(4)
                            .forEach(item -> System.out.print(item + ","));
        System.out.println();
        System.out.println(list);
        System.out.println(Arrays.toString(intArr));
    }
}
