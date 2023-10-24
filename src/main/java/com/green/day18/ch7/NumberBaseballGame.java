package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball nbb = new NumberBaseball(3);
        nbb.start();

    }
}

class NumberBaseball {

    private final int GAME_COUNT;
    private final int[] gameNumbers;
    public static final int MAX_NUM = 9;

    public NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];

    }

    public void start() {
        setRandomNumNotDuplicate();
        getUserInput();
    }

    private void getUserInput() {
        Scanner scan = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d숫자 >> ", i + 1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);

        scan.close();
    }

    public boolean isContinueCheckResult(int[] arr) {
        int strike = 0, ball = 0, out = 0;
        for (int i = 0; i < GAME_COUNT; i++) {
            for (int z = 0; z < arr.length; z++) {
                if (gameNumbers[i] == arr[z]) {
                    if (i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                }

            }
        }
        out = GAME_COUNT - (strike + ball);
        System.out.printf("strike : %d, ball : %d, out : %d\n",strike,ball,out);
        return false;
    }

    private void setRandomNumNotDuplicate() {
        for (int i = 0; i < gameNumbers.length; i++) {
            int rIdx = (int) (Math.random() * 10);
            gameNumbers[i] = rIdx;
            for (int z = 0; z < i; z++) {
                if (gameNumbers[i] == gameNumbers[z]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(gameNumbers));
    }

}
