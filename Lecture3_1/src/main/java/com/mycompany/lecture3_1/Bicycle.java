package com.mycompany.lecture3_1;

public class Bicycle implements Vehicle{
    int speed;
    int gear;
    
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    public void speedUp(int increment){
        speed += increment;
    }
    
    public void applyBrakes(int decrement){
        speed -= decrement;
    }
    
    public void printStates(){
        System.out.println("Speed: " + speed + "\nGear: " + gear);
    }
}
