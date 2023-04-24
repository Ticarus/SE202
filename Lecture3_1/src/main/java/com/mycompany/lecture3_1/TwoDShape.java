package com.mycompany.lecture3_1;

public abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    public TwoDShape(){
        width = height = 0;
        name = "none";
    }
    
    public TwoDShape(double width, double height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    
    //construct object with equal width and height
    public TwoDShape(double x, String name){
        width = height = x;
        this.name = name;
    }
    
    //construct an object from an object
    public TwoDShape(TwoDShape ob){
        this.width = ob.width;
        this.height = ob.height;
        this.name = ob.name;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void showDim(){
        System.out.println("Width and height are " + width + " " + height);
    }
    
    public abstract double area();
}
