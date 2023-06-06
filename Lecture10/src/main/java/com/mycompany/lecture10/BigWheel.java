package com.mycompany.lecture10;

public class BigWheel extends Car{
    public BigWheel(Product product, String carType){
        super(product, carType);
    }
    
    public void assemble(){
        System.out.println("Big Wheel");
        System.out.println("Assembling " + product.productName() + " for " + carType);
    }
    
    public void produceProduct(){
        System.out.println("Big Wheel");
        product.produce();
        System.out.println("Modifing product " + product.productName() + " according to -" + carType);
    }
}
