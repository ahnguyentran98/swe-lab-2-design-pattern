package adapter.adapter;

import adapter.adaptee.VideoPlayer;
import adapter.target_interface.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    private VideoPlayer videoPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer = new VideoPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        }
    }
}
