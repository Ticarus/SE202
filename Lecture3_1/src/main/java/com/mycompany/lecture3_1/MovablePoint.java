package com.mycompany.lecture3_1;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    
    public MovablePoint(){
        x = y = 0;
    }
    
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        return "Coordinations are \nX: " + x + "\nY: " + y;
    }
    
    public void moveUp(){
        y++;
    }
    
    public void moveDown(){
        y--;
    }
    
    public void moveLeft(){
        x--;
    }
    
    public void moveRight(){
        x++;
    }
}
