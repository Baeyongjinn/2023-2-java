package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        //Scanner를 이용하여 성별을 입력 (남자.여자)
        //만약에 남자가 입력 되었다면 콘솔에 "잘 생겼다." 출력
        //만약에 여자가 입력 되었다면 콘솔에 "예쁘다."출력
        //남자, 여자가 아님 값이 입력 되었다면 '누구냐" 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요 > ");
        String gender = scan.nextLine();

        if ("남자".equals(gender)) {
            System.out.println("잘생겼다");
        } else if ("여자".equals(gender)) {
            System.out.println("예쁘다");
        } else {
            System.out.println("누구냐");
        }
    }
}
