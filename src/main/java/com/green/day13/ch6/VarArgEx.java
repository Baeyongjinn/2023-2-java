package com.green.day13.ch6;


public class VarArgEx {

    public static void sum(int... arr) { //(...x) 가변인자, 컴파일러가 배열로 바꾸어 넘겨줌.
        int val =0;
        for(int a : arr) {
            val += a;
        }
        System.out.printf("sum: %d\n",val);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,30);
        sum(10,20,30,40);
        sum(10,20,30,40,50,50,50,50,50,50,50,50,50,50);

    }
}
