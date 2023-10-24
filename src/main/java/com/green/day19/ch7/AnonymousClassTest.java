package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {      //익명 클래스, 만들때 마다 값이 달라지길 원하면 익명 클래스로 만든다.
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
    }
}

interface Runnable2 {
    void run(); //추상 메소드, void 앞에 public abstract가 생략되어있음.
}

class RunRobot implements Runnable2 {

    @Override
    public void run() {
        System.out.println("로봇이 달린다");
    }

}
