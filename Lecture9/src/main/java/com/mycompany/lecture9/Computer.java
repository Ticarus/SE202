package com.mycompany.lecture9;

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hd;
    
    public Computer(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hd = new HardDrive();
    }
    
    public void run(){
        cpu.processData();
        memory.load();
        hd.readData();
    }
}
