package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitFruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Grape> grapeFruitBox = new FruitBox<>();
        //FruitBox<Toy> toyFruitBox = new FruitBox<>();
    }
}

class FruitBox<T extends Fruit> extends GBoxList<T> {
    List<T> getList() {
        return list;
    }
}