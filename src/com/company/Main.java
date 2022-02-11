package com.company;

public class Main {

    public static void main(String[] args) {
	Time time = new Time(10, 45, 23);

    System.out.println(time.toString());
    time.addHour(54);
    time.addMinute(163);
    time.addSecond(4562);

    System.out.println(time.toString());

    time.setTime(13, 37, 42);

    System.out.println(" ");

    System.out.println(time.toString());
    time.addHour(80);
    time.addMinute(22);
    time.addSecond(5);

    System.out.println(time.toString());
    }

}
