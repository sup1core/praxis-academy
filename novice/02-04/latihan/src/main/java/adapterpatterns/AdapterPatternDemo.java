package adapterpatterns;

/**
 * AdapterPatternDemo
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the perfect.mp3");
        audioPlayer.play("mp4", "cendol dawet.mp4");
        audioPlayer.play("vls", "cidro.vlc");
        audioPlayer.play("avi", "transpormer");
    }
}