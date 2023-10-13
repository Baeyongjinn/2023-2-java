package com.green.day12.ch6;

public class GugudanTest {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.print(5); //4단 구구단 출력

        gugudan.printFromTo(4, 7); //4~7단 출력
        gugudan.printFromTo(3, 4); //3~4단 출력

        gugudan.printFromTo(4,6, "-----");

    }
}
