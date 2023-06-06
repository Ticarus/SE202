package com.mycompany.lecture10;

public class BridgeDesignPatternShape {
    public BridgeDesignPatternShape(){
        Shape s1 = new Rectangle(new RedColor());
        s1.colorIt();
        Shape s2 = new Circle(new BlueColor());
        s2.colorIt();
    }
    
}
