package com.mycompany.lecture11;

public class MP3 implements MediaPlayer{
    @Override
    public void play(String fileName){
        System.out.println("Playing MP3 File " + fileName);
    }
}
