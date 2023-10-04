package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
        //주민번호 입력받으시고,
        //주민번호 확인하시고 > 여자인지 남자인지, 유효하지않은 주민등록번호인지 출력
        //switch문 사용
    public static void main(String[] args) {
        System.out.print("당신의 주민번호를 입력하세요.(011231-1111222) >> ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        char result = num.charAt(7);

        switch (result) {
            case '1', '3':
                System.out.println("남성");
                break;
            case '2', '4':
                System.out.println("여성");
                break;
            default:
                System.out.println("는(은) 유효하지않은 주민등록번호입니다");
        }
        //switch문은 정수,문자,문자열만 가능하다
    }
}
