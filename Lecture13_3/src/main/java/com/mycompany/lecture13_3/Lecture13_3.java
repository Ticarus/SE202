package com.mycompany.lecture13_3;

public class Lecture13_3 {

    public static void main(String[] args) {
        RadioStation station = new RadioStation(96.9);
        RadioListener listener1 = new RadioListener("Micheal", station);
        RadioListener listener2 = new RadioListener("Joseph", station);
        RadioListener listener3 = new RadioListener("William", station);
        listener1.callIn("I just wanted to say that I love ice cream. It's amazing really.");
    }
}