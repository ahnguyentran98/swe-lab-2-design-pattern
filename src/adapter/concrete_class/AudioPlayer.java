package adapter.concrete_class;

import adapter.adapter.MediaAdapter;
import adapter.target_interface.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("audio")) {
            System.out.println("Playing audio file: " + fileName);
        } else if (audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media type. Cannot play " + audioType + " format.");
        }
    }
}
