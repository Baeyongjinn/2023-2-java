package com.green.day84;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamEx5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(100, 1, 8, 10, 22);
        int sum = intList.stream().mapToInt(item -> item).sum();
        System.out.println("sum: " + sum);

        OptionalDouble avg = intList.stream().mapToInt(item -> item).average();
        if (avg.isPresent()) {
            System.out.println("avg: " + avg.getAsDouble());
        }
        double avg2 = Optional.of(avg).map(item -> item.getAsDouble()).orElse(0.0);
        System.out.println("avg2: " + avg2);
    }
}
