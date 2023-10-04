package com.green.day1;

public class VarEx2 {
    public static void main(String [] args) {
        //int '변수'
        //int ??  '변수 선언'
        //int ?? = 뒤에 오는 숫자는 '리터럴' 이라 부름.
        int x = 10, y =20;
        int temp = x;

        x = y;
        y = temp;

        // '+'는 문자열 을 합칠 때도 쓰는 기호.
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        int c = 12;
        int d = 20;
        System.out.println(c+d);
        System.out.println();
    }
}
