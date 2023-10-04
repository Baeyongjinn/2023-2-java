package com.green.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        주민번호 앞자리가 99로 시작하면 20세기표시
        00으로 시작하면 21세기 표시
         */
        Scanner s = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 예)000000 > ");
        String num = s.nextLine();

        char result = num.charAt(0);
        switch (result) {
            case '9':
                System.out.println("20세기");
                break;
            case '0':
                System.out.println("21세기");

        }

    }
}
