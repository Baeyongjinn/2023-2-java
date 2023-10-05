package com.green.day7.ch4;

public class FlowEx29Result {
    public static void main(String[] args) {
        //3, 6, 9게임
        /*
        i=1
        i=2
        i=3 짝
        i=4
        i=5
        i=6 짝
        i=30 짝
        i=33 짝짝
        i=99 짝짝
         */
        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d ", i);
            int tmp = i;
            do {
                if (tmp % 10 % 3 == 0 && tmp % 10 != 0)
                    System.out.print("짝");
            } while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}

