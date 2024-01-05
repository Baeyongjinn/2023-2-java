package com.green.day68.ch14;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        arr = new int[0];


    }
    public void add(int val){
        int[] newArr= new int[arr.length+1];

        for(int i=0; i<arr.length; i++){
            newArr[i]= arr[i];
        }
        newArr[arr.length]= val;

        arr= newArr;
    }

    public int[] getArr(){
        return arr;
    }
}
