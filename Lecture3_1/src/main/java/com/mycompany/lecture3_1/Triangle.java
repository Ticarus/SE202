package com.mycompany.lecture3_1;

public class Triangle extends TwoDShape{
    private String style;
    
    public Triangle(){
        super();
        style = "none";
    }
    
    public Triangle(String style, double w, double h){
        super(w,h,"triangle");
        this.style = style;
    }
    
    public Triangle(double x){
        super(x, "triangle");
        style = "filled";
    }
    
    public Triangle(Triangle ob){
        super(ob);
        style = ob.style;
    }
    
    public double area(){
        return getWidth() * getHeight() / 2;
    }
    
    public void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
