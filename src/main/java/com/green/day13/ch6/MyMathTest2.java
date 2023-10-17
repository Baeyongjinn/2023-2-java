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
        mm2_2.staticNum = 50;  //()가 없으니 맴버필드. 메소드는 ' = ' 을 쓰지 못함.
        System.out.printf("mm2_2.num = %d, staticNum = %d\n"
                , mm2_2.num, mm2_2.staticNum);
        MyMath2.staticNum = 100;
        System.out.printf("MyMath2.staticNum = %d\n"
                , MyMath2.staticNum); //static 메소드는 클래스 이름으로 접근 가능. ,()가 있으면 메소드, 없으면 맴버필드
                                      // 뒤에 . 이 붙어있으면 레퍼런스 변수라는걸 알수있다.

    }
}
