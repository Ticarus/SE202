package com.mycompany.lecture3_2;

public class Lecture3_2 {

    public static void main(String[] args) {
        shape_ex();
    }
    
    public static void shape_ex(){
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(7, 4);
        Triangle triangle = new Triangle(5, 12, 13);
        
        System.out.println("\n\n" + circle.ShapeInfo() + "\n");
        System.out.println("\n\n" + rectangle.ShapeInfo() + "\n");
        System.out.println("\n\n" + triangle.ShapeInfo() + "\n");
        
        Shape shapes[] = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;
        
        printInfo(shapes);
    }
    
    public static void printInfo(Shape[] s){
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("\n\n" + s[i].ShapeInfo() + "\n");
        }
    }
}
