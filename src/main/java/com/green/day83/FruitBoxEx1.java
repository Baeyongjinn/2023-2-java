package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx1 {
    public static void main(String[] args) {
    GBoxList<Fruit> fruitGBoxList = new GBoxList<>();
    fruitGBoxList.add(new Fruit());
    fruitGBoxList.add(new Apple());
    fruitGBoxList.add(new Grape());
        System.out.println(fruitGBoxList); //[Fruit, Apple, Grape]

        GBoxList<Apple> appleGBoxList = new GBoxList<>();
        appleGBoxList.add(new Apple());
        // appleGBoxList.add(new Fruit()); //에러
        // appleGBoxList.add(new Grape()); //에러
    //fruitGBoxList.add(new Toy());

        //GBoxList<Fruit> fruitGBoxList2 = new GBoxList();

        GBoxList<Toy> toyGBoxList = new GBoxList<>();
        toyGBoxList.add(new Toy());
        System.out.println(toyGBoxList);


    }
}

class Fruit {
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}


class Toy {
    public String toString() {
        return "Toy";
    }
}

class GBoxList<T> {
    protected List<T> list = new ArrayList<>();
    void add(T item) {
        list.add(item);
    }

   T get(int idx) {
        return list.get(idx);
    }

    int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

