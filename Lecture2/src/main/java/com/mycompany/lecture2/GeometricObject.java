package com.mycompany.lecture2;

public abstract class GeometricObject {
    private String color = "White";
    private boolean isFilled;
    private java.util.Date dateCreated;
    
    protected GeometricObject(){
        dateCreated = new java.util.Date();
    }
    
    protected GeometricObject(String color, boolean isFilled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.isFilled = isFilled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getIsFilled(){
        return this.isFilled;
    }
    
    public void setIsFilled(boolean isFilled){
        this.isFilled = isFilled;
    }
    
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    
    public String toString(){
        return "Created on " + dateCreated + "\nColor: " + this.color + " and filled: " + this.isFilled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}
