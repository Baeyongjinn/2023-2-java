package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult2 {
    public static void main(String[] args) {
        //for 문을 활용해 콘솔에 [5, 10, 7, 3] 출력 되도록 하시오.
        int[] arr = {5, 10, 7, 3, 100};
        System.out.println((Arrays.toString(arr)));

        System.out.println("(1)----------");
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
}

