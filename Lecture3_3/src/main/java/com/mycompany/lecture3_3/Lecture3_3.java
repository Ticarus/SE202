package com.mycompany.lecture3_3;

public class Lecture3_3 {

    public static void main(String[] args) {
        edible_animal_ex();
    }
    
    public static void double_implementation_ex(){
        /*
        Square square = new Square(4);
        Sphere sphere = new Sphere(3);
        
        Shape shapes[] = new Shape[2];
        
        shapes[0] = square;
        shapes[1] = sphere;
        
        System.out.println("Square area: " + shapes[0].area() + "\nSphere area: " + shapes[1].area());
        
        Shape3D shapes2[] = new Shape3D[1];
        
        shapes2[0] = sphere;
        
        System.out.println("Sphere volume: " + shapes2[0].volume());
        */
        Shape[] shapes = {new Square(4), new Sphere(3)};
        System.out.println("Shape: " + shapes[0].area());
        System.out.println("Shape: " + shapes[1].area());
        
        Shape3D[] shapes2 = {new Sphere(3)};
        System.out.println("Shape: " + shapes2[0].volume());
    }
    
    public static void edible_animal_ex(){
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for(int i = 0 ; i < objects.length ; i++){
            if(objects[i] instanceof Edible){
                System.out.println(((Edible) objects[i]).howToEat());
            }
            
            if(objects[i] instanceof Animal){
                System.out.println(((Animal) objects[i]).sound());
            }
        }
    }
}
