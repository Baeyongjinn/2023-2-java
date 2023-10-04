package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문을 활용하여 구구단 2~9단까지 출력

        for (int i = 2; i <= 9; i++) {

            for (int m = 1; m <= 9; m++) {
                System.out.printf("%d x %d = %d\n"
                                  , i, m, i * m);
            }
            System.out.println();
            System.out.println("-----------------------");
            System.out.println();
        }
    }
}