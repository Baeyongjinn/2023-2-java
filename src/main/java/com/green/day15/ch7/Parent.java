package com.green.day15.ch7;

public class Parent extends Object {  //모든객체는 Object를 상속 받는다.(extents Object)
    int age;
}

class Child extends Parent { //자식의 맴버필드는 사용 불가.
    public Child() {
        super();                  //super() 은 바로위 부모class의 기본 생성자 호출
    }

    void play() {
        System.out.printf("나는 %d살이야 같이 놀자~\n", age);
    }
}

class Child2 extends Parent { //extends를 쓰면 Parent의 주소값을 상속받았기 때문에 사용가능.
    void jump() {
        System.out.printf("%d살의 아이가 점프를 하였다\n", age);
    }
}

class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();

        Child2 c2 = new Child2();
        c2.age = 7;
        c2.jump();
    }
}
