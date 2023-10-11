package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11Result {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];

        for (int i = 0; i < LEN; i++) {
            int rIdx = (int) (Math.random() * LEN); // 0 ~ 9
            numArr[i] = rIdx;

        }
        System.out.println(Arrays.toString(numArr));

        /* for (int z = 0; z < LEN; z++) {
            int val = numArr[z];
            cntArr[val]++;

        }
        */
        for (int n : numArr) {    //향상된 for 문을 사용 해서 같은 값을 도출
            cntArr[n]++;
        }

        System.out.println(Arrays.toString(cntArr));
        /*
        numArr 각 방의 0~9 사이의 랜덤값 을 대입 한다 (중복 허용)
        numArr 각 방의 값도 출력
        cntArr 의 0번 방은 0의 개수, 1번 방은 1의 개수 count 값을 넣는다.
        0~9의 개수를 출력
        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의개수 : 0
        1의개수 : 0
        2의개수 : 0
        3의개수 : 1
        4의개수 : 3
        5의개수 : 2
        6의개수 : 1
        7의개수 : 2
        8의개수 : 0
        9의개수 : 1
         */

    }
}










