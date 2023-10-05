package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28Result {
    public static void main(String[] args) {
        /*
        1~100 사이의 정수를 입력하세요 >>
        입력한 숫자 보다 정답이 크다 > "Up"
        입력한 숫자 보다 정답이 작다 > "Down"
        맞출떄 까지 반복
         */

        int answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("1~100사이의 정수를 입력하세요 >> ");
            final int input = scan.nextInt();
            if (input == answer) { break; }
            System.out.println(input < answer ? "UP" : "Down");
        }
        System.out.println("끝!!");
    }
}