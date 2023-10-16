package com.green.day13.ch6;

public class MyMath2 {
    int num; //맴버필드
    static int staticNum; //static이 붙으면 다른 메모리 영역에 저장.
    //static이 붙으면 무조건 공간이 하나.

    void instanceAbs() { //메소드안에 인스턴스 변수를 쓰고있다면 static을 못쓴다.
        System.out.println(num < 0 ? -num : num);
    }

    static void staticAbs(int n) {
        System.out.println(n < 0 ? -n: n);
    }

    static void print() {
        System.out.printf("staticNum : %d\n", staticNum); //static 메소드는 인스턴스 변수를 사용할 수 없다.
    }
    void print2() {      // 가능한 메소드에 static을 붙이자.
        System.out.printf("\"staticNum : %d, num : %d\n", staticNum, num);
    }

}
