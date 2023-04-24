package com.mycompany.lecture3_3;

public class Sphere implements Shape, Shape3D{
    public double radius;
    
    public Sphere(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    
    public double volume(){
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }
}
