package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute;
    private HarmanSpeaker speaker;

    public SamsungTv() {
        speaker = new HarmanSpeaker();
    }

    public void sound() {
        if (!isMute) {
            speaker.speak();
        }
    }
    public void toggleMute() {
        isMute = !isMute;
    }
}
