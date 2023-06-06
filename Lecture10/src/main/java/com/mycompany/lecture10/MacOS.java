package com.mycompany.lecture10;

public class MacOS implements OperatingSystem{
    public void startup(){
        System.out.println("Starting up Mac");
    }
    
    public void loadUrl(String url){
        System.out.println("Opening Safari");
        System.out.println("Loading " + url + " in Safari");
    }
}
