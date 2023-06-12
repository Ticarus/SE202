package com.mycompany.lecture12_1;

public class Lecture12_1 {

    public static void main(String[] args) {
        RedDress rd = new RedDress();
        rd.addObserver(new User(rd));
    }
}
