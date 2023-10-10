package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        //1. 정수 10 개를 저장할 수 있는 배열을 만든다.
        //0~9 값을 순차적 으로 대입 한다.
        int[] val = new int[10];

        for (int i = 0; i < val.length; i++) {
            val[i] = i;
        }
        System.out.println(Arrays.toString(val));

        for (int i = 0; i < val.length; i++) {
            int rIdx = (int) (Math.random() * val.length);
            if (i == rIdx) { continue; }
            int tmp = val[i];
            val[i] = val[rIdx];
            val[rIdx] = tmp;
        }
        System.out.println(Arrays.toString(val));
    }
}

