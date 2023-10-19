package com.green.day15.ch7;

class Tv2{
    boolean power;
    int channel;
    void power() { power = !power; }
    void channelUp() { channel++; }
    void channelDown() { channel--; }


}

class CaptionTv2 extends Tv2 {
    int channel;
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }

    void printParentChannel() {
        System.out.printf("parent-channel: %d\n",super.channel); //super. 은 부모의 channel 값을 가져옴
    }                                                            //this. 은 나의 메소드,맴버필드를 가져옴(없을시 바로 위 부모의 맴버필드를 가져옴)
}                                                                //그냥 적을시 지역변수 channel 값을 가져옴
                                                                 //super() 은 바로위 부모class의 기본 생성자 호출
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10; //CaptionTv2에 channel이라는 맴버필드가 있는지 확인후 CaptionTv2의 channel에 10이 저장. 상속받은 맴버필드가 안적혀 있을시 부모의 맴버필드에 값을 저장.
        ctv.channelUp(); //Tv2의 channel에 channelUp메소드를 사용해 ++을 함.
        System.out.printf("ctv.channel : %d\n",ctv.channel);
        ctv.printParentChannel();
    }
}
