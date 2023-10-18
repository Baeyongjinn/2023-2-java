package com.green.day14.ch6;

public class Data1 {
    int value;
    int value2;
    int value3;

    public Data1() { // 기본 생성자(default constructor), 리턴타입 없어야함, 파라미터가 없음,클래스랑 이름이 같아야함.
        //System.out.println("constructor - Data1"); //생성자는 객체생성과 동시에 맴버필드 값을 주는게 가능 하다.
        //value1 = 100;
        //value2 = 200;
        //value3 = 300;
        this(100,200,300); //생성자 호출       //메소드에서는 생성자 호출불가능. new로 새로운 객체를 만들때는 사용가능.
    }

    public Data1(int a) { // 생성자도 Overloading 가능.
        value = a;
    }

    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }

    public void printMySelf() {
        System.out.printf("value: %d, value2: %d, value3: %d\n"
                , value, value2, value3);
    }
}

class ConstructorTest {

    public static void main(String[] args) {
        Data1 data1 = new Data1();
        data1.printMySelf();

        Data1 data1_2 = new Data1(10, 20, 30);
        data1_2.printMySelf();

    }
}
