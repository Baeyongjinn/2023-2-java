package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 10);
        }
        for (Integer val : list) {
            System.out.println(val);
        }
        System.out.println("--------");
        list.forEach(new MyConsumer<Integer>());
        System.out.println("---------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);
            }
        });
        System.out.println("---------");
        list.forEach(i -> System.out.println("MyConsumer(3) : " + i));
        System.out.println("------");
        list.removeIf((i) -> {
            return i % 2 == 0;
        }); // {} 생략시 자동으로 return {}입력시 직접 리턴
        System.out.println("-----");
//        list.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer v) {
//                return v % 2 == 0;
//            }
//        });                 // ↑
        list.removeIf(v -> v % 2 == 0); //위의 코드를 람다식 으로 작성 한것
        System.out.println(list); //원본을 건드림
        list.replaceAll(v -> v >= 15 ? v * 2 : v);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("name", "홍길동");
        map.put("age", "23세");
        map.put("height", "172cm");
        map.forEach( (k, v) -> System.out.printf("%s: %s\n",k,v));
    }
}

class MyConsumer<T> implements Consumer<T> {
    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1) : " + o);
    }
}
