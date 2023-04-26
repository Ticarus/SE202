package com.mycompany.lecture5_1;

public class Lecture5_1 {

    public static void main(String[] args) {
        game_ex();
    }
    
    public static void engineering_ex(){
        System.out.println("***Template Method Pattern Demo***\n");
        BasicEngineering preferredCourse = new ComputerSciences();
        System.out.println("Computer Sc. course will be completed in following order:");
        preferredCourse.completeCourse();
        System.out.println();
        preferredCourse = new Electronics();
        System.out.println("Electronics course will be completed in following order.");
        preferredCourse.completeCourse();
    }
    
    public static void game_ex(){
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
