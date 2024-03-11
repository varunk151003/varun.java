interface Playable {
    void play();
    void stop();
}
class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("MP3 player is playing.");
    }

    @Override
    public void stop() {
        System.out.println("MP3 player stopped.");
    }
}

class Radio implements Playable {
    @Override
    public void play() {
        System.out.println("Radio is playing.");
    }

    @Override
    public void stop() {
        System.out.println("Radio stopped.");
    }
}

public class MusicSystem {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        Radio radio = new Radio();

        mp3Player.play();
        mp3Player.stop();

        radio.play();
        radio.stop();
    }
}