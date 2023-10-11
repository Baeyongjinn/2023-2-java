package com.green.day10.ch6;

public class MethodExam {
    void checkZero(int n1) {
        System.out.println(n1 == 0 ? "0입니다." : "0이 아닙니다.");

    }

    int randomValFromTo(int n1, int n2) {
        return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }

    void scoreResultPrint(int score) {
        /*char grade = 'D';                    // 내가 적은답
        if (score < 0 || score > 100) {
            System.out.printf("%d : 잘못된 점수입니다.\n",score);
        } else {
            switch (score / 10) {
                case 9, 10:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
            }
            System.out.printf("%d : %c학점\n", score, grade);
         */
        if (score < 0 || score > 100) {                    //강사님이 설명하신 답
            System.out.println("잘못된 점수입니다.");
            return;
        }
        String grade = "D";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}
