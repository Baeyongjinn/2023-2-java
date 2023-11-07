package com.green.day29.ioc;

import com.green.day29.Speaker;
import com.green.day29.Woofer;

public class SamsungTv extends Tv {
  public SamsungTv(Speaker speaker) {
      System.out.println("-- Samsung생성 --");
      this.speaker = speaker;
  }
}
