package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        //(콘솔) 숫자를 하나 입력하세요 >
        //(입력 기다려야 함)
        //숫자를 입력하고 엔터를 누르면
        //(타입자유)변수에 해당값이 저장될 수 있도록
        //해당값이 홀수면
        //00은 홀수입니다.
        //해당값이 짝수면
        //00은 짝수입니다.

        //예) 입력을 8로했다.
        //8은 짝수입니다.
        //입력을 17로했다.
        //17은 홀수입니다.

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        int n1 = scan.nextInt();

        if (n1 % 2 == 1) {
            System.out.printf("입력하신 %d는(은) 홀수입니다.\n", n1);
        } else {
            System.out.printf("입력하신 %d는(은) 짝수입니다.\n", n1);
        }
    }
}
