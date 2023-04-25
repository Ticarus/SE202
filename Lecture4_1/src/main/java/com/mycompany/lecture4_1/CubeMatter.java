package com.mycompany.lecture4_1;

public class CubeMatter implements Matter{
    public double density;
    public double edge;
    
    public CubeMatter(double density, double edge){
        this.density = density;
        this.edge = edge;
    }
    
    public double getDensity(){
        return density;
    }
    
    public double getVolume(){
        return Math.pow(edge, 3);
    }
    
    public double getMass(){
        return density * getVolume();
    }
}
