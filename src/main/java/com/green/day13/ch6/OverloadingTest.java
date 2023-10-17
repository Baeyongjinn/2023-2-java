package com.green.day13.ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(145);
    }

    void print() {}  // Ouverloading : 같은 클래스의 같은 이름을 가진 메소드를 여러개 만드는것.
                     // 1.메서드 이름이 같아야 한다.
                     // 2.매개변수의 개수 또는 타입이 달라야 한다.

    void print(int n) {}

    void print(int n1, int n2) {}

    void print(int n1,String str2) {}

    void print(String str2, int n1) {}
}
