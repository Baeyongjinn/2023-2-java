package com.green.day12.ch6;

public class Gugudan {

    void print(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);


        }

    }

    void printFromTo(int min, int max) {
        for (int i = min; i <= max; i++) {
            print(i);
        }
    }
    void printFromTo(int min,int max,String s) {
        for (int i = min; i <= max; i++){
            System.out.println(s);
            print(i);
        }
    }
}
