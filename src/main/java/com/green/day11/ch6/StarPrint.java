package com.green.day11.ch6;

public class StarPrint {

    void line(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    void square(int cnt) {
        for (int z = 0; z < cnt; z++) {
            line(cnt); //line 메소드 활용
        }

    }

    void triangle(int cnt) {
        for (int i = 1; i <= cnt; i++) {
            line(i);
        }
    }

    String chkGenderById(String id) {
        char result = id.charAt(7);
        switch (result) {
            case '2', '4':
                return "여성";
            case '1', '3':
                return "남성";
        }
        return "유효하지 않은 주민번호";
    }
    int sumFromTo(int min,int max) {
        int sum = 0;
        for(int i=min;i<=max;i++) {
            sum += i;

        }
        return sum;

    }
}


