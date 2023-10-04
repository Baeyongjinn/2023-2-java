package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 > ");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        //score 값이 90점보다 같거나 크면 A학점 출력
        //score 값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8이상이면+, 3이하이면-,나머지는 없음(빈칸)
        //나머지 C학점 출력

        //예)92점 > A-, 94점 > A, 98점 > A+
        //   83점 > B- 출력, 86점 > B, 89점 > B+
        //   75or 79 or 71 > C

        if (score >= 98) {
            System.out.println("A+학점");
        } else if (score <= 93) {
            System.out.println("A학점");
        } else if (score >= 92) {
            System.out.println("A-학점");
        } else if (score >= 89) {
            System.out.println("B+학점");
        } else if (score >= 86) {
            System.out.println("B학점");
        } else if (score >= 83) {
            System.out.println("B-학점");
        } else {
            System.out.println("C학점");
        }
        System.out.println("-- 끝 --");


    }
}
