package com.mycompany.lecture4_1;

public class SphereMatter implements Matter{
    public double density;
    public double radius;
    
    public SphereMatter(double density, double radius){
        this.density = density;
        this.radius = radius;
    }
    
    public double getDensity(){
        return density;
    }
    
    public double getVolume(){
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
    
    public double getMass(){
        return density * getVolume();
    }
}
