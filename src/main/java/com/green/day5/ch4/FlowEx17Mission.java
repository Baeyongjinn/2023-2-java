package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    //5 입력
        /*

        ____*
        ___**
        __***
        _****
        *****

         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 >>> ");
        int Line = scan.nextInt();

        for (int i = 1; i <= Line; i++) {
            for (int z = Line - i; z > 0; z--) {
                System.out.print("_");
            }
            for (int z = 0; z < i; z++) {
                System.out.print("*");

            }

        }
        System.out.println();
    }


}


