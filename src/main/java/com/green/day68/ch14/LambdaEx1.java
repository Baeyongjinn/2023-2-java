package com.green.day68.ch14;

@FunctionalInterface //추상 메소드가 오직 하나인 Interface
interface MyFunction {
    void run(int n1, int n2);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction mf0 = (i,i2) -> { System.out.println("mf0 - run !!");
            System.out.println("dddddd");};                                 //람다식,밑의 축약 버전 보다 더 짧다 추상 메소드가 하나만 있기 때문에 메소드 선언부가 필요없다.
                                                                            // 파라미터가 값이 없으면 ()안에 값 생략 가능함
                                                                            // 명령어가 1개이면 {}생량 가능




        MyFunction mf1 = new MyFunction() {                     //밑의 상속문 축약 버전
            public void run(int i, int i2) {
                System.out.println("mf1 - run !!");
            }
        };

        MyFunction mf2 = new MyFunctionClass();

        mf0.run(1,2);
        mf1.run(1,2);
        mf2.run(1,2);
    }
}

class MyFunctionClass implements MyFunction {               // 같은 객체를 여러개 만들때 유리
    public void run(int i, int i2) {
        System.out.println("class name - run !! ");
    }
}
