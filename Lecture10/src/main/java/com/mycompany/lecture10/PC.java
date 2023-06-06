package com.mycompany.lecture10;

public class PC extends Computer{
    public PC(OperatingSystem logic){
        super(logic);
    }
    
    public void startup(){
        System.out.println("PC startup: ");
        os.startup();
    }
    
    public void browseInternet(String url){
        System.out.println("PC internet access: ");
        os.loadUrl(url);
    }
    
    public boolean canMoveComputer(){
        return false;
    }
}
