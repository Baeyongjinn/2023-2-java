package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17MissionResult {
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

        for (int i = Line; i > 0; i--) {
            for (int z = 1; z <= Line; z++) {
                if (z < i) {
                    System.out.print("_");
                } else {
                    System.out.print("*");
                }


            }
            System.out.println();

        }
    }


}


