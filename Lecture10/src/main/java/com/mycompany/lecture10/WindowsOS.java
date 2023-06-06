package com.mycompany.lecture10;

public class WindowsOS implements OperatingSystem{
    public void startup(){
        System.out.println("Starting up Windows");
    }
    
    public void loadUrl(String Url){
        System.out.println("Opening Microsoft Edge");
        System.out.println("Loading " + Url + " im Microsoft Edge");
    }
}