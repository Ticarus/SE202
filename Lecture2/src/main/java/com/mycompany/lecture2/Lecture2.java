package com.mycompany.lecture2;

public class Lecture2 {

    public static void main(String[] args) {
        GeometricObject geometricObject1 = new Circle(5);
        GeometricObject geometricObject2 = new Rectangle(10,15);
        
        System.out.println("The two objects have the same area? " + equalArea(geometricObject1, geometricObject2));
        displayGeometricObject(geometricObject1);
        displayGeometricObject(geometricObject2);
    }
    
    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }
    
    public static void displayGeometricObject(GeometricObject object){
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
