package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) {
                //new -> 객체생성 키워드
        Tv tv1 = new Tv(); //Tv 객체의 주소값 을 담을수 있는 변수 선언
        tv1.channel = 10;
        tv1.power = true;
        tv1.color = "빨간색";

        //모든 타입은 기본값 이 다 있다.
        //null 의 의미는 주소값 을 가지고 있지 않다는 뜻.

        Tv tv2 = new Tv();
        tv2.channel = 20;
        // '.'  은 객체한테 접근을 할때 씀

        System.out.println("tv1 == tv2 >> " + (tv1 == tv2));

        System.out.println("tv1.channel : " + tv1.channel);
        System.out.println("tv1.channel : " + tv1.power);
        System.out.println("tv1.channel : " + tv1.color);
        System.out.println("------------------");
        System.out.println("tv2.channel : " + tv2.channel);
        System.out.println("tv2.channel : " + tv2.power);
        System.out.println("tv2.channel : " + tv2.color);
    }
}
