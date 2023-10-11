package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                //국   영   수
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
                , {51, 52, 53}
        };
        int[] sumArr = new int[score[0].length];

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("=========================================");
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d", i + 1);
            int sum = 0;
            for (int z = 0; z < score[i].length; z++) {
                int val = score[i][z];
                sumArr[z] += val;
                sum += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float) sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.println("=========================================");
        System.out.print("총점");
        for(int val : sumArr) {
            System.out.printf(" %d",val);
        }

    }


}



        /*
        번호 국어 영어 수학 총점 평균
        -----------------------------
        1    100  102 103 306 102.0
         */
