package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score = {100, 88, 100, 100, 90};//누군가의 과목 점수
        int z = 0;
        //총점
        //평균 점수
        for(int i = 0; i< score.length;i++) {
            z += score[i];
        }

        System.out.printf("총점: %d\n",z);
        System.out.printf("평균 점수: %.1f\n",(double)z / score.length);

    }
}
