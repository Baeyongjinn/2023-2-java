package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox nb1 = new NumberBox(); //NumberBox 객체의 주소값 을 담을수 있는 변수 선언
                                         //다른 객체의 주소값 은 못담음

        nb1.sum(10,20); //메소드 호출
        nb1.sum(30,40); // 보내는 값은 argument 라고 부름
        nb1.minus(40,20);
        System.out.println("-------------");
        nb1.abs(-10); //10
        nb1.abs(10);  //10
        nb1.abs(-33); //33
        nb1.abs(39); //39

    }
}
