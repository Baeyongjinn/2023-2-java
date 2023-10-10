package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3 개의 String 값을 담을수 있는 배열을 생성.
        문자열 로 3번 입력을 받음(Scanner 이용)
        입력 받은 문자열 을 순차적 으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for 문을 이용 하여
        저장 되어 있는 값들을 콘솔에 출력 한다.
         */
        String[] strArr = new String[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < strArr.length; i++) {
            System.out.print("문자열을 입력 하세요 >> ");
            String str1 = scan.nextLine();
            strArr[i] = str1;
        }
        System.out.println();

        for (String a : strArr) {
            System.out.println(a);
        }
    }
}

