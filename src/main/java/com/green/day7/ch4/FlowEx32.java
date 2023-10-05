package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        /*
        (1) square
        (2) tri
        (3) log
        원하는 메뉴 (1~3)을 선택 하세요. (종료:0) >>

        위 내용이 계속 반복(0을 입력 하기 전까지)

        (1) square
        (2) tri
        (3) log
        원하는 메뉴 (1~3)을 선택하세요. (종료:0) >> 1 (엔터)
        선택 하신 메뉴는 1번 입니다.

        (1) square
        (2) tri
        (3) log
        원하는 메뉴 (1~3)을 선택하세요. (종료:0) >> 2 (엔터)
        선택 하신 메뉴는 2번 입니다.

        (1) square
        (2) tri
        (3) log
        원하는 메뉴 (1~3)을 선택 하세요. (종료:0) >> 4 (엔터)
        메뉴를 잘못 선택하셨습니다.

        (1) square
        (2) tri
        (3) log
        원하는 메뉴(1~3)를 선택하세요. (종료:0) >> 0 (엔터)
        프로그램을 종료합니다.
        */
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print(" (1) square\n"
                    + " (2) tri\n" +
                    " (3) log\n" +
                     " 원하는 메뉴 (1~3)을 선택 하세요. (종료:0) >> ");
            int m = scan.nextInt();
            if (m == 1) {
                System.out.println("선택 하신 메뉴는 (1) square 입니다.");
            } else if (m == 2) {
                System.out.println("선택 하신 메뉴는 (2) tri 입니다.");
            } else if (m == 3) {
                System.out.println("선택 하신 메뉴는 (3) log 입니다.");
            } else if (m == 0) {
                System.out.println("프로그램을 종료합니다.");
                break ;
            } else {
                System.out.println("메뉴를 잘못 입력하였습니다");
            }
            System.out.println();

        }
    }
}
