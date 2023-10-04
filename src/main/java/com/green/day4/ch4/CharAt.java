package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase(); //toUpperCase : 대문자로 변환 메소드
        System.out.println(str);

      char result =  str.charAt(1);
        System.out.println("result0 : " + str.charAt(0));
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str.charAt(2));
    }
}
