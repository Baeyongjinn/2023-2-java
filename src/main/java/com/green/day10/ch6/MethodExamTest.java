package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        MethodExam me = new MethodExam();
        me.checkZero(10); //0이 아닙니다.
        me.checkZero(9);  //0이 아닙니다.
        me.checkZero(0);  //0이 입니다.

        int r = me.randomValFromTo(10, 100);
        System.out.println(r);
        int r2 = me.randomValFromTo(5, 9);
        System.out.println(r2);


        me.scoreResultPrint(101); //잘못된 점수 입니다.
        me.scoreResultPrint(100); //A학점
        me.scoreResultPrint(90);//A학정
        me.scoreResultPrint(89); //B학정
        me.scoreResultPrint(80); //B학정
        me.scoreResultPrint(79); //C학정
        me.scoreResultPrint(69); //D학정(69점 이하는 전부 D학점)
        me.scoreResultPrint(-1); //잘못된 점수 입니다.


    }
}
