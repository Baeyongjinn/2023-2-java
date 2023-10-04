package com.green.day2.ch2;

public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        System.out.println(name);

        System.out.println("ja" + "va");

        //어떤 타입의 변수도 문자열과 덧셈연산을 수행하면 그 결과가 문자열이됨.
        System.out.println("12" + 10 + 9);
        //"12" + 10
        //"12" + "10"
        //"1210" + 9
        //"1210" +"9" > "12109"

        System.out.println("12" + (10 + 9));
        //10 + 0 > 19
        //"12" + 19
        //"12" + "19" > "1219"
    }
}
