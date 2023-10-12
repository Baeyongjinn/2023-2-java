package com.green.Note;

public class Method1 {
    //맴버필드, 속성, property, 전역변수
    String color;
    boolean power;
    int channel;

    //맴버메소드,메소드
    //void power() -> 메소드의 선언부
    //{ power = !power; } -> 메소드의 구현부
    //메소드 호출시 선언부만 입력하면됨.
    //                     메소드
    //                       ↓
    //void = 리턴타입, power = 메소드명, () = 파라미터(매개변수)
    void power() { power = !power; } //메소드 정의(생성)
    void channelUp() { channel++; }
    void channelDown() { channel--; }

    }

