package com.green.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /* Scanner 사용 문자열로 남자,Man,남
        여자,여,Woman,
        남자 "good"
        여자  'nice'
         */
        Scanner s =new Scanner(System.in);
        System.out.print("성별을 입력하세요 > ");
        String gender = s.nextLine();

                if("남자".equals(gender)|| "남".equals(gender) || "Man".equals(gender)) {
                    System.out.println("good");
                } else if ("여자".equals(gender) || "여".equals(gender) || "Woman".equals(gender))
                    System.out.println("nice");
    }
}
