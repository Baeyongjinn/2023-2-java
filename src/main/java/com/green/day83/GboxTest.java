package com.green.day83;

import java.util.ArrayList;
import java.util.List;

public class GboxTest {
    public static void main(String[] args) {
        Gbox g1 = new Gbox();
        g1.setItem(1);
        g1.setItem("우우우");

        Gbox<Integer> g2 = new Gbox<>();
        g2.setItem(1);
        g2.setItem(2);

        int intVal = g2.getItem();

        Gbox<String> g3 = new Gbox<>();
        g3.setItem("아아아");

        String strVal = g3.getItem();

        List<Integer> list = new ArrayList<>();
    }
}
