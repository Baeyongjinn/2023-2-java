package com.green.day7.ch4;

public class FlowEx30Result {
    public static void main(String[] args) {
        //반복문

        int sum = 0;
        int i = 0;
       final int target = 100;

        while (sum < target) {
            sum += ++i;
        }
        System.out.printf("sum: %d, i: %d\n", sum, i);
    }
}