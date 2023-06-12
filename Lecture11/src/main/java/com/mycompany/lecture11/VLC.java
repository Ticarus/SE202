package com.mycompany.lecture11;

public class VLC implements MediaPackage{
    @Override
    public void playFile(String fileName){
        System.out.println("Playing VLC File " + fileName);
    }
}
