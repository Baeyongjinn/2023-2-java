package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32Mission {
    public static void main(String[] args) {

        //만약에 n이 (음수 아무값)-10이였다면 콘솔에 10이 출력
        //만약에 n이 (양수 아무값)9이였다면 콘솔에 9이 출력

        //n = n *- 1;
        int n = -87;
        if (n < 0) {
            System.out.println(-n);
        } else {
            System.out.println(n);
        }

        System.out.println(n < 0 ? -n : n);
    }
}
