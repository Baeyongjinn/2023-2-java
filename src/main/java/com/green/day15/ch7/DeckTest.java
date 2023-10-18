package com.green.day15.ch7;

class Card {
    static final int KIND_MAX = 4; //카드 무늬의 수
    static final int NUM_MAX = 13; //무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind; //1 ~4
    int number;//1 ~ 13

    public Card() {
        //kind  = SPADE;
        //number = 1;
        this(SPADE, 1);
    }

    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        //return "kind: "+ kind + ", number: " + number;
        return String.format("kind: %d,number: %d", kind, number);
    }
}

class Deck {
    final int CARD_NUM = 52;
    Card[] cardArr = new Card[CARD_NUM];


    public Deck() {
        int idx = 0;
        for (int i = 1; i <= Card.KIND_MAX; i++) {
            for (int z = 1; z <= Card.NUM_MAX; z++) {
                cardArr[idx++] = new Card(i, z);
            }
        }

        for (Card c : cardArr) {
            System.out.println(c);
        }
    }

    public Card pick(int i) {
        return this.cardArr[i];
    }
    public Card pick() {
        int rIdx = (int)(Math.random()*CARD_NUM);
        return cardArr[rIdx];
    }
}

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card c1 = deck.pick(51);
        System.out.println("----");
        System.out.println(c1);
        System.out.println("----");
        Card c2 = deck.pick();
        System.out.println(c2);
    }
}


        /*Card c = new Card(4,2);
        System.out.println(c + "dd"); //kind :4, number :2
        System.out.println(c.toString()); //kind :4, number :2

        Card c2 = new Card(1,10);
        System.out.println(c2);

        Card c = new Card();
        System.out.printf("c.kind: %d, c.number: %d\n"
                , c.kind, c.number); //c.kind: 4,c.number: 1

        Card c2 = new Card(Card.HEART, 7);
        System.out.printf("c2.kind: %d, c2.number: %d\n"
                ,c2.kind,c2.number); //c,kind:2, c2.number : 3

        System.out.println(c2.toString());
        System.out.println(c2);

        String str = new String("ddd");
        System.out.println(str);

        System.out.println(str.toString());
         */




