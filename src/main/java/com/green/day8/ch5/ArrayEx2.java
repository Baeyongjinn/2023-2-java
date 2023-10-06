package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~5의 랜덤한 값을 넣어 주세요.
        중복 허용
         */
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * arr1.length) + 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}