package com.green.day16.ch7;

public class Animal {
    public void crying() {                                         //다형성
        System.out.println("동물이 운다.");                         //1.상속관계에서만 나타남.
    }
}

class AnimalTest3 {
    public static void main(String[] args) {  //instance를 사용하지 않는다면 static Method를 사용 할수 있다
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog); // Dog에 Cat주소를 상속받고있지않아 false가 나온다
       // Dog dog = (Dog)ani;
        System.out.println(ani instanceof  Cat); //instanceof는 boolean 타입
        Cat cat =(Cat)ani;
        System.out.println("--끝--");
    }
}
class AnimalTest {
    public static void main(String[] args) {
        //1. 부모타입은 자식 객체 주소값 담을 수 있다.
        Dog d1 = new Bulldog();
        Animal ani1 = new Bulldog();
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        //2. 자식타입은 부모 객체 주소값 담을 수 없다.
        //Bulldog bull1 = new Dog();
        System.out.println("끝");

        //3. 타입은 알고 있는 메소드만 호출할 수 있고
        //   호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        bull3.jump();
        bull3.crying();

        Dog dog2 = new Bulldog();   // Dog와 Bulldog의 위치를 바꾸면 에러가 터짐(자식 타입은 부모 객체의 주소값을 담을수 없기때문)
        dog2.crying();    //Bulldog객체의 주소값을 담아서 불독객체의 crying메소드가 나온다. new 에 Dog class의 주소값을 넣으면 Dog에 있는 crying이 실행.
    }                     //가장 빨리 만나는 Method호출
}

class AnimalTest2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

        System.out.println(bulldog instanceof Dog); //instanceof : 형변환이 가능할때 ture 아닐시 false가 나온다
        System.out.println(bulldog instanceof Bulldog); //(A instanceof B)A는 주소값 B는 class가 와야함.
        System.out.println(bulldog instanceof Animal);
        Animal ani = bulldog;
        System.out.println(ani instanceof Cat); //false가 나옴으로 형변환이 불가능함
        //Cat cat2 = (Cat)ani;  //에러가 나옴

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }
    private static void callCrying(Animal ani) {
        ani.crying();
        //bulldog인지 체크 > 맞으면 jump() 호출 아니면 아무것도 안함.
        if(ani instanceof Bulldog) {         //(A instanceof B) A타입을 B타입으로 바꾸고 싶을때 ture면 가능 false는 불가능
            Bulldog bulldog = (Bulldog)ani;
            bulldog.jump();
        }
    }
}

class Dog extends  Animal {
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}


class Bulldog extends Dog {
    public void jump() {
        System.out.println("불독이 점프! 점프!");
    }
    @Override
    public void crying() {
        System.out.println("불독이 왈! 왈!");
    }
}

class Cat extends Animal {
    @Override
    public void crying() {
    System.out.println("야옹~야옹~");
    }
}