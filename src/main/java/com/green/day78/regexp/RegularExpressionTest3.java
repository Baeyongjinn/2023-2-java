package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest3 {
    public static void main(String[] args) {
        String str1 = "하12";
        String str2 = "하123";
        String str3 = "히히1111";
        String str4 = "1111";
        String str5 = "ㅇ    ㄹㅇㄴ량하하하하ㅑㅑㅑ122233";
        String regexp = "^([ㄱ-ㅎㅏ-ㅣ가-힣0-9 ]+[0-9]*)$";

        System.out.printf("%s > %b\n",str1, Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2, Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3, Pattern.matches(regexp,str3));
        System.out.printf("%s > %b\n",str4, Pattern.matches(regexp,str4));
        System.out.printf("%s > %b\n",str5, Pattern.matches(regexp,str5));
    }
}
