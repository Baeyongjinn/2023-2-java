package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        final int MIN = 15, MAX = 18;


        //MIN, MAX 상수만 사용
        //MIN ~ MAX 나올수 있는 램덤 숫자를 만드는 로직을 구현

        for (int i = 0; i < 10; i++) {
            int val = (int) (Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("val : " + val);
            if (val < MIN || val > MAX) {
                System.out.println("범위를 벗어났습니다");
                break;
            }
        }
        System.out.println("끝!!!");
    }
}
