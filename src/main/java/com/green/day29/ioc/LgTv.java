package com.green.day29.ioc;

import com.green.day29.Speaker;

public class LgTv extends Tv {
    public LgTv(Speaker speaker) {
        System.out.println("-- Lg생성 --");
        this.speaker = speaker; }


}
