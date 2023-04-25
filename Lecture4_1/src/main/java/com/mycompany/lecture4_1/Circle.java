package com.mycompany.lecture4_1;

public class Circle implements IShape{
    private double _radius;
    
    public Circle(double r){
        _radius = r;
    }
    
    public double getArea(){
        return Math.PI * Math.pow(_radius, 2);
    }
    
    public String toString(){
        return "Circle Shape";
    }
}
