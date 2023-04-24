package com.mycompany.lecture3_3;

public class Square implements Shape{
    public double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double area(){
        return side * side;
    }
}
