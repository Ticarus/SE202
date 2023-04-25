package com.mycompany.lecture4_1;

public class Pizza {
    private double _price;
    private IShape _shape;
    
    public Pizza(double p, IShape s){
        _price = p;
        _shape = s;
    }
    
    public double getPrice(){
        return _price;
    }
    
    public IShape getShape(){
        return _shape;
    }
    
    public String toString(){
        return _shape.toString();
    }
}
