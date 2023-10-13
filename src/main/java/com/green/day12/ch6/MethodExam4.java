package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {


    int[] plusMap(int[] arr, int val) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i] + val;

        }
            return temp;
    }
    void plusOrigin(int[] arr,int val2) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += val2;


        }
    }

    int[] randomValFromTo(int arr,int min,int max) {
       int[] tempArr = new int[arr];
       for(int i = 0;i< tempArr.length;i++) {
           tempArr[i] = (int)(Math.random() * (max -min)+1) + min;

       }
           return tempArr;
    }

    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();

        int[] arr = {10, 20, 30};
        int[] rArr1 = me4.plusMap(arr,2); //비파괴 메소드(원본을 건드리지 않고 만듬)
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));

        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr)); //[14, 24, 34]
        //배열크기,랜덤값 min,랜덤 max값
        int[] rArr2 = me4.randomValFromTo(10,5,20);
        System.out.println(Arrays.toString(rArr2));
    }
}
