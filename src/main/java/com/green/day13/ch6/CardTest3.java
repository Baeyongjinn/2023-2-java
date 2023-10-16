package com.green.day13.ch6;


class Card {
    String pattern; // Spade, Heart
    String denomination; //A, 2~10, J ,Q , K

    void printYourSelf() {
        System.out.printf("%s-%s\n"
                , pattern, denomination);

    }

}

public class CardTest3 {
    public static void main(String[] args) {
        Card c = new Card();
        c.pattern = "Spade";
        c.denomination = "A";
        c.printYourSelf(); // Spade-A

        Card c2 = new Card(); //Card객체의 주소값 저장
        c2.pattern = "Heart";
        c2.denomination = "J";
        c2.printYourSelf(); // Heart-J

        Card[] cards = makeCards(); //Card[]의 주소값 저장
        System.out.println(cards.length);
        for (Card c1 : cards) {
            c1.printYourSelf();

        }

    }

    public static Card[] makeCards() {
        Card[] cArr = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        for (int i = 0; i < cArr.length; i++) {
            String pattern = patterns[i / 13];
            String denomination = getNumberFromInt((i + 1)% 13);
 //           cArr[i] = new Card();
 //           cArr[i].pattern =pattern;
  //          cArr[i].denomination = denomination;
            Card c = new Card();
            cArr[i] = c;
            c.pattern = pattern;
            c.denomination = denomination;
        }

        return cArr;
    }
    public static String getNumberFromInt(int num) {
        switch (num) {
            case 0:
                return "K";
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
        }
        return String.valueOf(num);
    }
}
