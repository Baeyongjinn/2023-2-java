package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        printArr(arr); //[3, 2, 1, 6, 5, 4]
        System.out.println(Arrays.toString(arr)); //[3, 2, 1, 6, 5, 4]
        sortArr(arr);
        printArr(arr); //[1, 2, 3, 4, ,5 ,6]
        System.out.println(Arrays.toString(arr)); //[1, 2, 3, 4, ,5 ,6]

        System.out.println("sum = " + sumArr(arr));

    }


    public static void sortArr(int[] arr) { // 오름차순 정렬
        for (int i = arr.length - 1; i > 0; i--) {
            for (int z = 0; z < i; z++) {
                int nIdx = z + 1;
                if (arr[z] > arr[nIdx]) {
                    int tmp = arr[z];
                    arr[z] = arr[nIdx];
                    arr[nIdx] = tmp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);

        }
        System.out.printf("%d]\n", arr[arr.length - 1]);
    }

    public static  int sumArr(int[] arr1) {
            int sum = 0;
        for (int val : arr1) {
            sum += val;


        }
        return sum;
    }
}



