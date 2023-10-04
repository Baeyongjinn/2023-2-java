package com.green.test;

import java.util.Scanner;

public class ForTest2 {
    public static void main(String[] args) {
//        사용자로부터 구구단 중 하나의 숫자를 입력받으세요.
//        입력받은 숫자의 구구단을 1부터 9까지 곱한 결과를 출력하세요.
//        for문을 사용하여 반복적으로 결과를 출력하세요.

        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 > ");
        int i = scan.nextInt();
        for (int z = 1; z <= 9 ;z++){
            System.out.printf("%d x %d = %d\n",i,z,i*z);
        }

    }
}


