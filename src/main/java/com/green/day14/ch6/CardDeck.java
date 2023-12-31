package com.green.day14.ch6;


public class CardDeck {
    Card[] cards;  //Card[]의 주소값을 cards에 저장.


    public CardDeck() {
        cards = new Card[52];

        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattern = patterns[i];
            for (int z = 1; z <= 13; z++) {
                String denomination = this.getNumberFromInt(z); //this.은 주소값 복사랑 똑같다
                cards[idx++] = new Card(pattern, denomination);

            }
        }

    }

    private String getNumberFromInt(int num) { //private는 같은 클래스 안에서만 사용가능.
        switch (num) {                         //외부에서 호출 불가.
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

    public void printAll() {
        for (Card c : cards) {
            c.printMySelf();
        }
    }

    public Card getCard() {
        Card c = null;
        while (true) {
            int rIdx = (int) (Math.random() * cards.length);
            c = cards[rIdx];
            if (c != null) {
                cards[rIdx] = null;
                break;
            }
        }
        return c;

    }
}
