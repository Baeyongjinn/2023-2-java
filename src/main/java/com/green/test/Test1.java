package com.green.test;

public class Test1 {
    public static void main(String[] args) {
        int rVal = (int)(Math.random()* 331) + 20;

        int result = 0;

        if(rVal <= 180) {
            result = rVal * 2;
        }else  {
            result = rVal + 2;
        }
        System.out.println("rVal :"+ rVal);
        System.out.println(result);
    }
}
//180이하면 *2 180초과 +20 최소값20~350