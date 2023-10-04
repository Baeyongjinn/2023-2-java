package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        int val = (int) (Math.random() * 100) + 1; //1~100

        System.out.printf("%d는(은) %s수입니다."
                , val
                , val % 2 == 0 ? "짝" : "홀");


        //val값이 11이면  > "11는(은)홀수 입니다."
        //val값이 12이면  > "12는(은)짝수 입니다."
    }
}
