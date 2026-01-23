package main.java.com.lld.design_patterns.adaptor_pattern.mediaService;

import main.java.com.lld.design_patterns.adaptor_pattern.media.LegacyPlayer;
import main.java.com.lld.design_patterns.adaptor_pattern.media.MediaPlayer;

public class MediaService {
    private final MediaPlayer mediaPlayer;

    // constructor still exists, but now accepts MediaPlayer
    public MediaService(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }
    public void playMedia(String fileType) {
        mediaPlayer.play(fileType);
    }
}
