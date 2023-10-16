package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.staticNum = 30;
        System.out.printf("mm2.num = %d, staticNum = %d\n"
                , mm2.num, mm2.staticNum);

        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.staticNum = 50;
        System.out.printf("mm2_2.num = %d, staticNum = %d\n"
                , mm2_2.num, mm2_2.staticNum);
        MyMath2.staticNum = 100;
        System.out.printf("MyMath2.staticNum = %d\n"
                , MyMath2.staticNum); //static 메소드는 클래스 이릅으로 접근가능.

    }
}
