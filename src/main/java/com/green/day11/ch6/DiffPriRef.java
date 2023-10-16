package com.green.day11.ch6;

public class DiffPriRef {
    public static void main(String[] args) {
        int num = 30;
        changeVal(num);
        System.out.println("num : " + num);

        NumBox nb = new NumBox();    //NumBox 객체생성. // nb 에 NumBox 주소값을 복사
        System.out.println(("(1)nb.num : " + nb.num));
        nb.num = 50;
        System.out.println(("(2)nb.num : " + nb.num));
        changeVal(nb);
        System.out.println(("(3)nb.num : " + nb.num));

    }

    public static void changeVal(int num) {              //파라미터 타입이 다르면 똑같은 이름의 메소드를 만들수 있다.(오버로딩)
        System.out.println("changeVal - int");
       num = 30;

    }

    public static void changeVal(NumBox dd) {
        System.out.println("changeVal - NumBox");
        dd.num = 10;
       
    }
}

class NumBox {
    int num;
}
