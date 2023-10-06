package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        //for 문을 활용해 콘솔에 [5, 10, 7, 3] 출력 되도록 하시오.
        int[] arr = {5, 10, 7, 3};

        int commaLen = arr.length -1;
        System.out.print("[");
        for(int i=0;i<arr.length;i++) {
            if(i< commaLen) {
                System.out.printf("%d, ",arr[i]);
            }else {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.print("]\n");
        System.out.println("(2)--------");

        System.out.print("[");
        for(int i=0;i<arr.length;i++) {
            if(i< commaLen) {
                System.out.print(arr[i] +", ");
            }else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]\n");

        System.out.println("(3)-----------");
        System.out.print("[");
        for(int i=0;i<arr.length;i++) {
            System.out.print(i < commaLen ? arr[i] + ", " : arr[i]);
        }
        System.out.print("]");
    }
}
