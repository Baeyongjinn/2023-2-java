package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int Price = c.getPrice();
        int BonusPoint = c.getBonusPoint();

        Tv tv = new Tv();
        int tvPrice = tv.getPrice(); //100
        int tvBonusPoint = tv.getBonusPoint();//10

    }
}

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        System.out.println(buyer); //money: 1000, bonusPoint: 0;
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        System.out.println(buyer);


        //buyer money가 부족하면 "잔액 부족" money값이 마이너스 처리 x
        //잔액이 부족하지 않으면  Tv을/를 구입하셨습니다.
        // >money 차감처리, bounspoint 플러스처리

    }
}

class Buyer extends Tv {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1000;
        this.bonusPoint = 0;
    }
    public void buy(Product product) {
        if (product.getPrice() > this.money) {
            System.out.println("잔액부족");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        System.out.printf("%s을/를 구입하셨습니다.\n", product);
    }
    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d", money, bonusPoint);

    }
}


class Product {
    private int price;
    private int bonusPoint;

    protected Product(int price) {             //생성자는 객체생성할때 딱 한번만 호출.
        this.price = price;
        bonusPoint = (int) (price * 0.1);
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    @Override
    public String toString() {
        return String.format("price: %d bonusPoint: %d", price, bonusPoint);
    }
}


class Tv extends Product {                    //생성자를 호출시 빨간줄이 뜨면 값을 넣거나
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";

    }


}

class Computer extends Product {

    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

