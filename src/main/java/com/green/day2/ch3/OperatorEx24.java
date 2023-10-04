package com.green.day2.ch3;

public class OperatorEx24 {
    public static void main(String[] args) {
        //'and' 연산자는 모든값이 (true)이여야 (true)가 나온다. (false)가 하나라도 있으면 (false)가 나옴 .
        // '&&' 기호
        boolean b1 = 1 == 1 && 2 == 2; //and 연산자
        System.out.println("b1 : " + b1);

        boolean b2 = 1 == 1 && 2 == 2 && 3 == 4;//and 연산자
        System.out.println("b2 : " + b2);

        System.out.println("-------------------");
        // '||' 기호
        boolean b3 = 1 == 2 || 2 == 3 || 4 == 4;// or 연산자
        System.out.println("b3 : " + b3);

        boolean b4 = 1 == 2 || 2 == 3 || 4 == 4;// or 연산자
        System.out.println("b4 :" + b4);

        System.out.println("-------------------");
        //부정연산자  '!'기호

        boolean b5 = 1 == 1;
        System.out.println("b5 :" +b5);
        System.out.println("!b5 :" +!b5);
        System.out.println("!!b5 :" +!!b5);
    }
}
