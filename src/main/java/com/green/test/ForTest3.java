package com.green.test;

import java.util.Scanner;

public class ForTest3 {

    public static void main(String[] args) {
//        사용자로부터 정수 하나를 입력받으세요. 이 정수는 피라미드의 높이를 나타냅니다.
//        입력받은 숫자만큼의 높이를 가진 별 피라미드를 만들어 출력하세요. 예를 들어, 입력이 5이면 다음과 같은 피라미드를 출력해야 합니다:
//            *
//           ***
//          *****
//         *******
//        *********
        Scanner scanner = new Scanner(System.in);
        System.out.print("피라미드의 높이를 입력하세요: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            // 공백을 먼저 출력하여 오른쪽 정렬을 만듭니다.
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }

            // 별을 출력합니다.
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}