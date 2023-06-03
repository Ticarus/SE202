package com.mycompany.lecture6_1;

public class CapTextFormatter implements TextFormatter{
    public void format(String text){
        System.out.println("[CapTextFormatter]: " + text.toUpperCase());
    }
}
