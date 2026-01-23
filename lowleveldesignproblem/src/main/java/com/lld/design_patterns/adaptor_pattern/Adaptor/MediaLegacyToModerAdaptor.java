package main.java.com.lld.design_patterns.adaptor_pattern.Adaptor;

import main.java.com.lld.design_patterns.adaptor_pattern.media.LegacyPlayer;
import main.java.com.lld.design_patterns.adaptor_pattern.media.MediaPlayer;

public class MediaLegacyToModerAdaptor implements MediaPlayer {
    private LegacyPlayer legacyPlayer;
    public MediaLegacyToModerAdaptor(LegacyPlayer legacyPlayer){
        this.legacyPlayer = legacyPlayer;
    }
    @Override
    public void play(String fileName) {
        legacyPlayer.playVlc(fileName);
    }
}
