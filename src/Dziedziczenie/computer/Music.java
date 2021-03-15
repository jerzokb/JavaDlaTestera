package Dziedziczenie.computer;

public interface Music {

    // W interjesie nie możemy mieć żadnych pól obiektu
    // Pola obiektu opisują stan obiektu
    // Można tworzyć tylko stałe - domyślnie są one public static final

     String NAME = "MUSIC";

    // Metody opisują zachowanie - możemy tworzyć abstrakcyjne metody - domyślnie public abstract

    void playMusic();
    void pauseMusic();
    void stopMusic();

    // Od JAVY 8 można tworzyć metody domyślne

    default void sayHalloFromMusic() {
        System.out.println("Hallo from Music default");
    }

    default void sayHallo() {
        System.out.println("Hallo Music");
    }

    // publiczne metody statyczne

    static String getName() {
        privateMethod();
        return NAME;
    }

    // Java 9 - prywatne statyczne metody
    private static void privateMethod() {
        System.out.println("Hallo from private method");
    }
}
