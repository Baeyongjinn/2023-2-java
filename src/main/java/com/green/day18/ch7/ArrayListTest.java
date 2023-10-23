package com.green.day18.ch7;

import com.green.day12.ch6.Card;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(13l);
        list.add("dddd");
        list.add(new Card());

        Object val1 = list.get(0);
        int intVal = (int) val1;

        float intVal2 = (float) list.get(1);


        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();
    }
}

class ArrayListTest2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(); //<>안에 기본형은 적을수 없다. 래퍼클래스만 가능. Integer타입을 넣어 정수만 입력가능.
        list.add(10);             //void Method처럼 쓰인다.
        list.add(20);
        list.add(30);
        list.add(45);
//        list.add(10.3f);
//        list.add(10.3d);
//        list.add("ddd");
        int val1 = list.get(0);
        System.out.println(list.get(1));

        System.out.println("size: " + list.size()); //크기를 알고싶을때 .size사용. 여기는 .length를 안씀.
        System.out.println("------------");

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d]: %d\n", i, list.get(i));
        }
        System.out.println("------------");
        for (int val : list) {
            System.out.println(val);
        }

        //[0]: 10
        //[1]: 20
        //[2]: 30

    }
}

class ArrayListTest3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        list.add(1,100); // list.add(a,b) a번 방에 b를 삽입, 그 뒤에 있는 값들은 뒤로 밀림.
        System.out.println(list);
        list.add(3,200);
        System.out.println(list);
        list.remove(0); //지우는 메소드
        System.out.println(list);

    }
}
