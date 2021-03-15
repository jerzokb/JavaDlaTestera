package Dziedziczenie.computer;

public interface Video {

    void playVideo();
    void pauseVideo();
    void stopVideo();

    default void sayHalloFromVideo() {
        System.out.println("Hallo from Video default");
    }

    default void sayHallo() {
        System.out.println("Hallo Video");
    }
}
