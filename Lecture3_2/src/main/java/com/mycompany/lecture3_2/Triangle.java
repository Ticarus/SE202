package com.mycompany.lecture3_2;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area(){
        return Math.sqrt((a + b + c / 2)*((a + b + c / 2) - a)*((a + b + c / 2) - b)*((a + b + c / 2) - c));
    }
    
    public double perimeter(){
        return a + b + c;
    }
    
    public String ShapeInfo(){
        return "Shape:Triangle\nSide A: " + a + "\nSide B: " + b + "\nSide C: " + c + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
