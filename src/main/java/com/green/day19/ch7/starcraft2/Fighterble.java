package com.green.day19.ch7.starcraft2;

//interface는 다중상속 가능.구현부가 없어서 가능.   //같은 interface 끼리는 extends 사용.
public interface Fighterble extends Movable,Attackable {}

interface Movable { void move(int x, int y); }

interface Attackable { void attack(Unit u);}

class Unit {
    private int currentHp;
    private int x;
    private int y;
}

class Fighter extends Unit implements Fighterble{

    @Override
    public void move(int x,int y) {  }


    @Override
    public void attack(Unit u) {  }
}

class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);

        Fighterble fighter = (Fighter)movable;
        fighter.attack(null);

        Attackable attackable = (Attackable) movable;
        attackable.attack(null);
    }
}
