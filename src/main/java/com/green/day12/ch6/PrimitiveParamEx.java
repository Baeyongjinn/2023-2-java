package com.green.day12.ch6;

class Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.printf("main() : x = %d\n", d.x);
        change(d.x);
        System.out.printf("main() : x = %d\n", d.x);
        System.out.println("--------------");
        Data d2 = new Data();
        d2.x = 100;
        System.out.printf("main() : d2.x = %d\n", d2.x);
        change(d2);
        System.out.printf("main() : d2.x = %d\n", d2.x);

    }

    public static void change(int x) {                    //같은 이름의 객채를 만들수 있다.(오버로딩)
        x = 1000;
        System.out.printf("main() : x = %d\n", x);
    }
    public static void change(Data d) {
        d = new Data();
        d.x = 1000;
        System.out.printf("main() : x = %d\n", d.x); //3
    }

}

