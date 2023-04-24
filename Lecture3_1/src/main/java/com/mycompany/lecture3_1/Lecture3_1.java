package com.mycompany.lecture3_1;

public class Lecture3_1 {

    public static void main(String[] args) {
        movable_ex();
    }
    
    public static void abstract_review(){
        TwoDShape shapes[] = new TwoDShape[4];
        
        shapes[0] = new Triangle("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10, 4);
        shapes[3] = new Triangle(7.0);
        
        for(int i = 0 ; i < 4 ; i++){
            System.out.println("Object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
        }
    }
    
    public static void interfaces_intro(){
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(3);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.println("Bicycle present state: ");
        bicycle.printStates();
    }
    
    public static void movable_ex(){
        MovablePoint p = new MovablePoint();
        System.out.println(p.toString());
        p.moveDown();
        System.out.println(p.toString());
        p.moveRight();
        System.out.println(p.toString());
    }
    
    public static void shape_ex(){
        
    }
}
