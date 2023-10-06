package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMission {
    public static void main(String[] args) {

     /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1~10의 랜덤한 값을 넣어주세요.
        (중복 제거)
         */
        int[] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 5) + 1;

            for (int z = 0; z < i; z++) {
                if (arr1[i] == arr1[z]) {
                    i--;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr1));
        }
    }



