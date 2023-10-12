package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); //*****
        sp.line(7); //*******

        sp.square(4);
        //****
        //****
        //****
        //****

        sp.triangle(5);
        //*
        //**
        //***
        //****
        //*****

        String gender = sp.chkGenderById("111231-1117111");
        System.out.println("gender : " + gender);
        /*
        8번째 자리의 숫자가 2,4 이면 > 여성
        8번째 자리의 숫자가 1,3 이면 > 남성
        이외의 값이면 >유효하지않은 주민번호
         */

        int sum = sp.sumFromTo(4, 10);
        System.out.println("sum : " + sum);
        int sum2 = sp.sumFromTo(10, 15);
        System.out.println("sum2 : " + sum2) ;
    }
}
