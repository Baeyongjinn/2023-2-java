package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
            System.out.println("answer : " + answer);
        while (true) {
            System.out.print("1~100사이의 정수를 입력하세요 >> ");
            input = scan.nextInt();
            if(input == answer ) {
            } else if (input > answer) {
                System.out.println("Down");
            } else if (input < answer) {
                System.out.println("up");

            }
            System.out.println("끝!!");
        }






        /*
        1~100 사시의 정수를 입력하세요 >>
        입력한 숫자보다 정답이 크다 > "Up"
        입력한 숫자보다 정답이 작다 > "Down"
        맞출떄 까지 반복
         */
    }
}