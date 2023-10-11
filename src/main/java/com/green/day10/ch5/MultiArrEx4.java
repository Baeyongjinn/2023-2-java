package com.green.day10.ch5;

import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"}
                , {"computer", "컴퓨터"}
                , {"integer", "정수"}

        };
        /*
        Q1. chair의 뜻은? >> dmdsa
        틀렸습니다. 정답은 의자입니다.

        Q2. computer의 뜻은? >> 컴퓨터
        정답입니다.

        Q3. interger의 뜻은? >> 정주
        틀렸습니다. 정답은 정수입니다.
        */
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            String a = words[i][1];
            String msg = "틀렸습니다 " + "정답은 " + a + " 입니다";
            System.out.printf("Q%d. %s의 뜻은? >> \n",i+1,words[i][0]);
            String s = scan.next();
            if (a.equals(s)) {
                msg = "정답입니다";
            }

                System.out.println(msg);
            }

        }
    }

