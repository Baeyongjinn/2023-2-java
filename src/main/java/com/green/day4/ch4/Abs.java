package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        int num = -10;

        //10은(은) 절대값 10
        //-9는(은) 절대값 9


        System.out.println("___________________________(A)");
        if (num < 0) { //음수
            System.out.printf("(1)%d는(은) 절대값 %d\n", num, num * -1);
        } else { //양수
            System.out.printf("(2)%d는(은) 절대값 %d\n", num, num);
        }

        System.out.println("___________________________(B)");
        System.out.printf("(3)%d는(은) 절대값 %d\n"
                , num, num < 0 ? -num : num);

        System.out.println("___________________________(C)");
        int result = num < 0 ? -num : num;
        System.out.printf("(4)%d는(은) 절대값 %d\n :",num , result);
    }
}