package com.green.day9.ch5;

public class ArrayEx18 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
        };

        /*
        literal 사용 금지 (0만 사용 가능)!
        score[0][0] = 101
        score[0][1] = 102
        score[0][2] = 103
        ...
        score[3][2] = 43
        sum = ??
         */
        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[0].length; z++) {
                System.out.printf("score[%d][%d] = %d\n", i, z, score[i][z]);

                sum += score[i][z];

            }
        }
        System.out.println(sum);


    }
}




