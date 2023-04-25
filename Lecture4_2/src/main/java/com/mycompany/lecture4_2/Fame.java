package com.mycompany.lecture4_2;

public class Fame {
    private static Fame fameInstance = null;
    //just to test
    private static int count = 0;
    private int id;
    
    private Fame(){
        id = count;
        count++;
    }
    
    public static Fame getInstance(){
        if(fameInstance == null){
            fameInstance = new Fame();
        }
        return fameInstance;
    }
    
    public static int getCount(){
        return count;
    }
}
