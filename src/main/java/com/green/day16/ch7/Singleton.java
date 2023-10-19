package com.green.day16.ch7;

public class Singleton {
    private Singleton() {                    //private이 붙어서 내부에서만 접근가능.
    }
    private static Singleton singleton;

    public static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
