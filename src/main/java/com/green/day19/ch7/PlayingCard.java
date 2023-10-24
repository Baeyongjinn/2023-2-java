package com.green.day19.ch7;
//interface타입은 객체화는 안되지만 주소값은 줄수있다.
public interface PlayingCard {   //interface 는 public static final을 생략해도 자동으로 들어간다.
    public static final int SPADE = 4; //모든 맴버면수는 public static final 이어야한다.(생락가능)
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber(); // interface 는 public abstract이어야 하며 이를 생략해도 자동으로 들어간다.
    String getCardKind();
}

interface  PlayingChess extends PlayingCard { //같은 interface 끼리는 extends 사용.
    void moveHorse(int x, int y);
}

class Chess implements PlayingChess {

    @Override
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}

class Card implements PlayingCard {   // interface타입의 상속문은 implements이다.

    @Override                                           //쓸려면 Override 해야함.
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

}
class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);
    }
}
