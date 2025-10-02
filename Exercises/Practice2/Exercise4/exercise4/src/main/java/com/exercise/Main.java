package com.exercise;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();

        System.out.println(clock.displayTime());
        clock.clockEvent();
        while( clock.getHours() != 0 || clock.getMinutes() != 0 ) {
            clock.clockEvent();
            System.out.println(clock.displayTime());
        }
        clock.clockEvent();
        System.out.println(clock.displayTime());
    }
}