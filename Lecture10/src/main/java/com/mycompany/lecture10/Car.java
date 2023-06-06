package com.mycompany.lecture10;

public abstract class Car {
    protected Product product;
    protected String carType;
    
    public Car(Product product, String carType){
        this.product = product;
        this.carType = carType;
    }
    
    public abstract void assemble();
    public abstract void produceProduct();
    
    public void printDetails(){
        System.out.println("Car: " + carType + ", Product: " + product.productName());
    }
}
