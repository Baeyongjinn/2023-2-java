package com.green.day78.regexp;

import java.util.regex.Pattern;

public class RegularExpressionTest6 {
    public static void main(String[] args) {
        String str1 = "990223-1231456";
        String str2 = "011-1234-1113";
        String str3 = "016-12345-1";
        String str4 = "017-12-33";
        String str5 = "018-1-2";
        String str6 = "019-0000-33333";
        String regexp = "^[\\d]{2}((02(0[1-9]|1[0-9]|2[0-9]))|(0[1|3-9]|1[0-2])(0[1-9]|[1-2][0-9]|3[0-1]))-[1-4][0-9]{6}$";

        System.out.printf("%s > %b\n",str1, Pattern.matches(regexp,str1));
        System.out.printf("%s > %b\n",str2, Pattern.matches(regexp,str2));
        System.out.printf("%s > %b\n",str3, Pattern.matches(regexp,str3));
        System.out.printf("%s > %b\n",str4, Pattern.matches(regexp,str4));
        System.out.printf("%s > %b\n",str5, Pattern.matches(regexp,str5));
        System.out.printf("%s > %b\n",str6, Pattern.matches(regexp,str6));

    }
}
