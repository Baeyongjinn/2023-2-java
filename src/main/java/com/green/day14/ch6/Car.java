package com.green.day14.ch6;

public class Car {
    String color;
    String gearType; //변속기 종류 - auto(자동), manual(수동)
    int door; //문의 개수

    public Car() {
      this("white");
    }

    public Car(String color) {
        this(color,"auto",4);


    }
    public Car(String color,String gearType,int door) {   //Overloading 생성자
        this.color = color;                              //이름이 같을떄 this.을 써야 한다(이름이 다르면 생략 가능)
        this.gearType = gearType;
        this.door = door;
    }

    public void printMySelf() {
        System.out.printf("color=%s, gearType=%s, door=%d\n"
                , color, gearType, door);
    }
}


class CarTest {

    public static void main(String[] args) {
        Car car1 = new Car();            //new ?? 은  ??생성자 호출
        Car car2 = new Car("blue");

        car1.printMySelf(); //color=white, gearType = auto, door = 4
        car2.printMySelf(); //color=blue, gearType = auto, door = 4


    }
}
