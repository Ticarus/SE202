package com.mycompany.lecture6_1;

public class LowerTextFormatter implements TextFormatter{
    public void format(String text){
        System.out.println("[LowerTextFormat]: " + text.toLowerCase());
    }
}
