package com.green.day14.ch6;

public class Card {
    String pattern;                //전역변수
    String denomination;           //객체가 살아있는 동안은 계속 남아있다.


    public Card(String pattern, String denomination) {
        this.pattern = pattern;                     //지역변수
        this.denomination = denomination;          //호출이 끝난는 순간 사라진다.
                                                   //이름과 맴버필드가 같으면 앞에 this.을 붙여야함
                                                    //this.은 맴버필드나 메소드 사용할때 씀.
    }                                              //this()는 생성자 사용시 사용.

    void printMySelf() {
        System.out.printf("%s (%s)\n"
                , pattern, denomination);
    }




}
