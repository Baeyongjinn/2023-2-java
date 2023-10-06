package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMissionResult {
    public static void main(String[] args) {
        //for 문을 활용해 콘솔에 [5, 10, 7, 3] 출력 되도록 하시오.
        int[] arr = {5, 10, 7, 3};
        System.out.println((Arrays.toString(arr)));

        int commaLen = arr.length - 1;
        System.out.println("(1)----------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < commaLen) {

                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("(2)----------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {

                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
    }
}
