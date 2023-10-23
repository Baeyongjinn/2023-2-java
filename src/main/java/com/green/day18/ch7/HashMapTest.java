package com.green.day18.ch7;

import java.util.*;


public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 10);     //(Key, Value) Key만 알고 있어도 Value를 불러올수있다.
        map.put("b", 20);
        map.put("b", 30);     //같은 이름은 마지막에 입력한 값이 나옴.


        Object obj =map.get("b");
        int val = (int)obj;
        System.out.println("val : " + val);
    }
}

class HashMapTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Tv",0);
        map.put("Computer",0);
        map.put("Audio",0);

        map.put("Tv",map.get("Tv") + 1);
        map.put("Tv",map.get("Tv") + 1);

        System.out.println("Tv-count : " + map.get("Tv"));
        System.out.println("size : " + map.size());
    }
}
