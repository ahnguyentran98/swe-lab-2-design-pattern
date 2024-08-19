package adapter;

import adapter.concrete_class.AudioPlayer;
import adapter.target_interface.MediaPlayer;

public class AdapterClientApplication {

/*    The Adapter pattern is a structural design pattern that allows objects with incompatible interfaces to work together.
        It's like a bridge between two interfaces that wouldn't otherwise be compatible.
    This pattern involves creating an adapter that converts the interface of a class into another interface that a client expects.

    Key Points:
    Client: The class that expects a certain interface to interact with.
    Adaptee: The class with an existing interface that is incompatible with what the client expects.
    Adapter: The class that implements the interface expected by the client and internally uses an instance of the adaptee to fulfill the client's requests.
    Use Case:
    Imagine you have a media player application that can play audio files.
    You want to extend it to play videos as well, but the existing codebase only supports an audio player interface.
    You can use the Adapter pattern to allow the audio player to play video files by adapting a video player to the audio player interface.*/

    public void use(){
        MediaPlayer audioPlayer = new AudioPlayer();

        // Playing audio file
        audioPlayer.play("audio", "song.mp3");

        // Playing video file using adapter
        audioPlayer.play("video", "movie.mp4");

        // Trying to play an unsupported format
        audioPlayer.play("image", "picture.png");
    }
}
