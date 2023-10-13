package com.green.day12.ch6;

public class MethodExam3 {

    int sumText(String str) {

        int val = Integer.parseInt(str);                      //모드 사용
        int sum = 0;
        do {
            int modVal = val % 10;
            sum += modVal;
            val /= 10;
        } while (val > 0);
        return sum;
    }

    int sumText2(String str) {                                    //char 배열 사용
        char[] charArr = str.toCharArray();
        int sum = 0;
        for(char ch : charArr) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodExam3 me3 = new MethodExam3();
        int sum = me3.sumText("123123"); //12
        System.out.println("sum : " + sum);

        System.out.println("sum : " + me3.sumText("222"));//6

        System.out.println("sum2 : " + me3.sumText2("111"));


    }
}
