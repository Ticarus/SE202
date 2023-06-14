package com.mycompany.lecture13_1;

public class Lecture13_1 {

    public static void main(String[] args) {
        LightMediator2 lightMediator = new LightMediator2();
        Light2 red = new Light2Impl("Red", lightMediator);
        Light2 yellow = new Light2Impl("Yellow", lightMediator);
        Light2 green = new Light2Impl("Green", lightMediator);
        
        red.turnON();
        yellow.turnON();
        green.turnON();
    }
}
