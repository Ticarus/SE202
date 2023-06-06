package com.mycompany.lecture10;

public abstract class Computer {
    public OperatingSystem os;
    
    public Computer(OperatingSystem os){
        this.os = os;
    }
    
    public abstract void startup();
    public abstract void browseInternet(String url);
    public abstract boolean canMoveComputer();
}
