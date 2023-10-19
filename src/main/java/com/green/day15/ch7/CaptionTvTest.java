package com.green.day15.ch7;



class Tv{
    boolean power;   //속성,맴버필드,전역변수(객체가 살아있는동안 유지)
    int channel;
    void power() { power = !power; }     //메소드
    void channelUp() { channel++; }
    void channelDown() { channel--; }


}

class CaptionTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
    @Override   //Annotation    Override가 잘된지 검증하기 위해 @Override 적음             // 부모class가 가지고 있는 Method를 새롭게 정의 해서 쓰는것(선언부는 같고 구현부를 바꿈)
    void channelUp() {
        channel += 5;
    }
}


public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n",cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n",cTv.power);
        cTv.power();
        System.out.printf("cTv.power : %b\n",cTv.power);
        cTv.channel= 10;
        cTv.channelUp();
        System.out.printf("cTv.channel : %d\n",cTv.channel);
        cTv.displayCaption("반갑다 친구들!!!");
        cTv.caption = true;
        cTv.displayCaption("safsaffsasafa");

    }
}
