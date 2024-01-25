package com.green.day83;

import org.checkerframework.checker.units.qual.A;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Apple());
        fruitFruitBox.add(new Grape());

        Juice j1 = Juicer.makeJuice(fruitFruitBox);
        System.out.println("j1: " + j1);

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.add(new Apple());
        appleFruitBox.add(new Apple());

        Juice j3 = Juicer.makeJuice(appleFruitBox);
        System.out.println("j3: " + j3);

//        FruitBox<Toy> toyFruitBox = new FruitBox<>();
//        toyFruitBox.add(new Toy());
//        toyFruitBox.add(new Toy());
//
//        Juice j2 = Juicer.makeJuice(toyFruitBox);
    }
}

class Juice {
    private String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return this.name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String temp = "";
        for(Fruit f : box.list){
            temp += f + " ";
        }
        return new Juice(temp);
    }
}
