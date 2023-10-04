package com.green.day6.ch4;

public class FlowEx24 {
    public static void main(String[] args) {
        int i = 11;
        System.out.println("카운트 다운을 시작합니다");
        while (i-- != 0) {
            System.out.println(i);
            //20억
            for (int z = 0; z < 3_000_000_0; z++) {
                System.out.print("");
            }
        }
        System.out.println("Launch!!");
    }
}
