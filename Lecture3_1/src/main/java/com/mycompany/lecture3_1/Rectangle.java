package com.mycompany.lecture3_1;

public class Rectangle extends TwoDShape{
    public Rectangle(){
        super();
    }
    
    public Rectangle(double width, double height){
        super(width, height, "rectangle");
    }
    
    public Rectangle(double x){
        super(x, "rectangle");
    }
    
    public boolean isSquare(){
        return getWidth() == getHeight();
    }
    
    public double area(){
        return getWidth() * getHeight();
    }
}
