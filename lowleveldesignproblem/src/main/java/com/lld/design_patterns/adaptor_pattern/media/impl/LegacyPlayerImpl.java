package main.java.com.lld.design_patterns.adaptor_pattern.media.impl;

import main.java.com.lld.design_patterns.adaptor_pattern.media.LegacyPlayer;

public class LegacyPlayerImpl implements LegacyPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }
}
