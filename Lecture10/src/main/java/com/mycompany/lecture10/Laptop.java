package com.mycompany.lecture10;

public class Laptop extends Computer{
    public Laptop(OperatingSystem logic){
        super(logic);
    }
    
    public void startup(){
        System.out.println("Laptop startup: ");
        os.startup();
    }
    
    public void browseInternet(String url){
        System.out.println("Laptop internet access: ");
        os.loadUrl(url);
    }
    
    public boolean canMoveComputer(){
        return true;
    }
}
