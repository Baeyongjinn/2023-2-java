package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2Result3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >");

        int n1 = scan.nextInt();
        if (n1 == 0) {
            System.out.println("다른값을 입력해주세요");
        } else {
            System.out.printf("입력하신 %d는(은) %s수입니다.\n"
                    , n1
                    , n1 % 2 == 0 ? "짝" : "홀"
            );

        }
    }
}
