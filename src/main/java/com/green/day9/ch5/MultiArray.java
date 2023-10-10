package com.green.day9.ch5;


public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = {        // []배열을 담을수 있음
                { 100, 200 },
                { 300, 400 },
                { 500, 600 }
        };
        System.out.println(arr[0][0]);   // [0]번방의 1번쨰 값
        System.out.println(arr[0][1]);   // [0]번방의 2번쨰 값
        System.out.println(arr[1][0]);   // [1]번방의 1번쨰 값
        System.out.println(arr[1][1]);   // [1]번방의 2번쨰 값
        System.out.println(arr[2][0]);   // [2]번방의 1번쨰 값
        System.out.println(arr[2][1]);   // [2]번방의 2번쨰 값

        System.out.println("-------");
        int[] intArr = arr[2];
        System.out.println(intArr[1]);

        System.out.println("-------");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
        /*
        int[] intArr1 = arr[0];

        int[] newIntArr = {1, 2, 3, 4 };
        arr[0] = newIntArr;
         */

    }
}
