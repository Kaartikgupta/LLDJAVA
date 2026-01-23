package main.java.com.lld.design_patterns.adaptor_pattern.app;

import main.java.com.lld.design_patterns.adaptor_pattern.Adaptor.MediaLegacyToModerAdaptor;
import main.java.com.lld.design_patterns.adaptor_pattern.media.LegacyPlayer;
import main.java.com.lld.design_patterns.adaptor_pattern.media.MediaPlayer;
import main.java.com.lld.design_patterns.adaptor_pattern.media.impl.LegacyPlayerImpl;
import main.java.com.lld.design_patterns.adaptor_pattern.mediaService.MediaService;
//Adapter Pattern allows incompatible interfaces to work together by converting one interface into another expected by the client.
public class MediaApp {
    public static void main(String[] args) {
        System.out.println("Media Player Application Started");
        // Your media player application logic goes here
        LegacyPlayer legacy = new LegacyPlayerImpl();
        MediaPlayer adaptor = new MediaLegacyToModerAdaptor(legacy);
        MediaService ms = new MediaService(adaptor);
        ms.playMedia("ahjksdgb.vlc");
        System.out.println("Media Player Application Ended");

    }
}
