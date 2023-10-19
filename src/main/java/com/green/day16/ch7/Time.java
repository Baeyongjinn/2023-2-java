package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR= 0;
    public final static int MAX_HOUR= 23;
    private int hour, minute, second;
    //private 맴버필드에 값을 넣는 방법 : 메소드 이용,생성자 이용.
    //private 맴버필드에 값을 빼는 방법 : 메소드 이용.

    //private 맴버필드에 값 넣는 방법
    //1.생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2. setter 메소드,변수 하나당 setter 메소드를 만들어 줘야함
    public void setHour(final int hour) {
        if(hour > MAX_HOUR) { this.hour = MAX_HOUR; return; }
        if(hour < MIN_HOUR) { this.hour = MIN_HOUR; return; }
        this.hour = hour;
    }

    public void setMinute(int minute) { this.minute = minute; }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {

        //String strHour = String.valueOf(hour < 10 ? "0" + hour : hour);   다른방법
        return String.format("%02d:%02d:%02d"
                , hour, minute, second);


    }
}


class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 20, 30);
        time.setMinute(30);

        time.setHour(4); //0~23, 만약 초과값이 들어오면 23이, 0미만 값이 0 들어가도록

        System.out.println(time); //
        //time.hour = 10;
    }
}


