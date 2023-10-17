package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] cards = makeCards(); //static method , Card[]타입(return type)
        System.out.println(cards.length); //52

        for (Card c : cards) {
            c.printYourSelf(); //Spade (A), Heart (2) // class Card에 있는 메소드.
        }

    }

    public static Card[] makeCards() {
        Card[] cards = new Card[52];
        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String number = getNumberFromInt(z);
                Card c = new Card();
                c.kind = kinds[i];
                c.number = number;
                //cards[(i*13) + (z-1)]=c;
                cards[cnt++] = c;
            }
        }

        //Spade, Heart, Diamond, Club
        //A, 2~10, J, Q, K

        return cards;
    }

    public static String getNumberFromInt(int num) {
        switch (num) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(num);
    }


}

