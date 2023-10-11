package com.green.day10.ch6;

public class NumberBox {
    void sum(int n1, int n2) {  //변수 하나당 각각의 타입을 적어 줘야함.
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }

    void minus(int n1, int n2) {
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }

    void abs(int n1) {
        System.out.println(n1 < 0 ? -n1 : n1);


    }
}




