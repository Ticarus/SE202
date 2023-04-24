package com.mycompany.lecture3_2;

public class Circle implements Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return Math.PI * radius * radius;
    }
    
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    
    public String ShapeInfo(){
        return "Shape: Circle\nRadius: " + radius + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
