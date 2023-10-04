package com.green.test;

import com.green.day4.ch4.Switch;

import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        /*
        /영문 대문자를 입력받아 'A'이면 "훌륭합니다."
        , 'B'이면 "좋습니다.",
        'C'이면 "보통입니다.",
        'D'이면 "노력하세요.",
         그이외문자는 "잘못입력하셨습니다."라고 출력하는 프로그램
                */
        Scanner scan = new Scanner(System.in);
        System.out.print("A,B,C,D,중 하나의 문자를 대문자로 입력하세요 > ");
         String grade = scan.nextLine();

        switch (grade) {
            case "A":
                System.out.println("훌륭합니다");
                break;
            case "B":
                System.out.println("좋습니다");
                break;
            case "C":
                System.out.println("보통입니다");
                break;
            case "D":
                System.out.println("노력하세요");
                break;
            default:
                System.out.println("잘못입력하셨습니다");
        }

    }
}
