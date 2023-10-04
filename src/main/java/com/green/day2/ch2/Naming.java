package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args) {
        // 1. 대소문자 구별 o . 길이제한 x


        // 2. 이름으로 예약어 사용 x
        // int, void, static

        // 3.숫자 첫문장 x. 예: int 1ab x , int a1b o

        // 4.특수문자 _ , $ 만 가능.
        // int_ab, $ist

        // 케이스 기법
        // 예) hello my name is hong

        // 1.파스칼 케이스 기법(클래스명) > 대문자로 시작 (중요)
        // HelloMyNameIsHong

        // 2. 카멜 케이스 기법(변수명,메소드명) > 소문자로 시작 (중요)
        // helloMyNameIsHong

        // 3. 케밥 케이스 기법
        // hello-my-name-is-hong ( - 기호는 java에서 이름으로 사용불가)

        // 4. 스네이크 케이스 기법
        // hello_my_name_is_hong


        //----------------------------------------------------------------
        // 상수는 전부 대문자 구분은 언더바

        // PI, MAX_NUMBER
        final int PI = 0, MAX_NUMBER = 10;

        Date today = new Date();
        // Date 객체를 생성해서, 그 주소를 today에 저장

        // 대문자로 시작하는 타입은 참조형(reference type)

    }
}
