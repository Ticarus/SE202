package com.mycompany.lecture14_1;

public class Leaf implements IComponent{
    public int price;
    public String name;
    
    public Leaf(String name, int price){
        this.price = price;
        this.name = name;
    }
    
    public void displayPrice(){
        System.out.println("Component Name: " + name + " and Price: " + price);
    }
}
