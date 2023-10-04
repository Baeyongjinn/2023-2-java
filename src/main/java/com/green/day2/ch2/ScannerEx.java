package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        //new는 객체화를 만드는 키워드
        // 객체
//         속성(값저장,명사)
//         메소드(기능,동사)

        Scanner scan = new Scanner(System.in);
        System.out.print("두자리 정수를 하나 입력해주세요 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        //double num = Double.parseDouble(input);

        System.out.println("입력내용: " + (input + input));
        System.out.printf("num=%d\n", (num + num));





    }
}
