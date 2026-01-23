package main.java.com.lld.design_patterns.adaptor_pattern.media.impl;

import main.java.com.lld.design_patterns.adaptor_pattern.media.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
    @Override
    public void play(String audioType){
        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: song.mp3");
        }
        else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
