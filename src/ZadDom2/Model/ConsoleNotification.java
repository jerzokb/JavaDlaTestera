package ZadDom2.Model;

public interface ConsoleNotification {

    default void notifyStatusChange(String bugStatus) {
        if (bugStatus != "Open" && bugStatus != "Close") {
            System.out.println("Status not recognized!");
        } else {
            System.out.println("Status został zmieniony!");
        }
    }
}
