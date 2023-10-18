package com.green.day15.ch7;



class Tv{
    boolean power;
    int channel;
    void power() { power = !power; }
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
    @Override                    // 부모가 가지고 있는 Method를 새롭게 정의 해서 쓰는것
    void channelUp() {
        channel += 2;
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
