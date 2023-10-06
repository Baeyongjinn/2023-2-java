package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95, 231, 200, -100, 300};
        int max = score[0];
        int min = score[0];
        //score 안에서 min 값과 max 값을 찾아서 출력 해 주세요.

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {max = score[i];}
            if (score[i] < min) {min = score[i];}
        }
        System.out.printf("min : %d\n", max);
        System.out.printf("min : %d\n", min);
    }
}

