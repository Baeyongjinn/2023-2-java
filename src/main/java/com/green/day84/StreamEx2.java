package com.green.day84;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx2 {
    public static void main(String[] args) {
        Random r = new Random();

        IntStream intStream = r.ints();
        intStream.limit(10).forEach(System.out::println);

        System.out.println("------------");
        r.ints(10).forEach(System.out::println);

        System.out.println("------------");
        List<Integer> intList = r.doubles()
                        .mapToInt(item ->  (int)(item * 10) + 1).boxed().distinct().limit(5).collect(Collectors.toList());
        System.out.println(intList);

        System.out.println("--------------1 ~ 45 랜덤 숫자 6개");
        r.ints(1,46).boxed().distinct().limit(6).sorted().forEach(System.out::println);

        System.out.println("끝");
    }
}
