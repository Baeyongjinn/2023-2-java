package com.green.day19.ch7;


class PlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

public abstract class Player { //클래스 밑에 abstract(추상 메소드) 메소드가 하나라도 있다면 클래스도 abstract(추상 클래스)이 무조건 붙어야 한다.
    public abstract void play(int pos); //추상 클래스를 상속 받으면 추상 메소드를 무조건 Override 해야한다.
}                                   // 추상 클래스는 구현부가 없다.


class AudioPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Audio play 위치 : " + pos);
    }
}

class VideoPlayer extends Player {

    @Override
    public void play(int pos) {
        System.out.println("Video Play 위치 " + pos);
    }
}

abstract class DvdPlayer extends Player {

}