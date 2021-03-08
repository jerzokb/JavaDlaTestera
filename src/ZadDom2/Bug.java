package ZadDom2;

public class Bug {

    // POLA OBIEKTU
    String bugDesc; // opis błędu
    String ownerEmail; // adres emial osoby zgłaszającej błąd
    int bugPriority; // priorytet błędu (1-5)
    String bugStatus; // Status błędu (otwarty / zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    // KONSTRUKTOR
    public Bug(String bugDesc, String ownerEmail, int bugPriority) {
        this.bugDesc = bugDesc;
        this.ownerEmail = ownerEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = "Open";
    }

    void showBugInfo() {
        System.out.println("Bug information:");
        System.out.println("Description: " + bugDesc);
        System.out.println("Bug owner: " + ownerEmail);
        System.out.println("Bug priority: " + bugPriority);
        System.out.println("Bug status: " + bugStatus);
        System.out.println("***** ***");
    }

    void showBugOwner() {
        System.out.println("Bug owner: " + ownerEmail);
        System.out.println("***** ***");
    }

    void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
        System.out.println("***** ***");
    }

    void showBugPriority(int p) {
        switch (p) {
            case 1:
                System.out.println("Priority " + p + "-HIGHEST");
                System.out.println("***** ***");
                break;
            case 2:
                System.out.println("Priority " + p + "-HIGH");
                System.out.println("***** ***");
                break;
            case 3:
                System.out.println("Priority " + p + "-MEDIUM");
                System.out.println("***** ***");
                break;
            case 4:
                System.out.println("Priority " + p + "-LOW");
                System.out.println("***** ***");
                break;
            case 5:
                System.out.println("Priority " + p + "-LOWEST");
                System.out.println("***** ***");
                break;
        }
    }

    void changeStatus() {
        if (this.bugStatus == "Open") {
            this.bugStatus = "Close";
        } else if (this.bugStatus == "Close") {
            this.bugStatus = "Open";
        } else {
            System.out.println("Status not recognized!");
            System.out.println("***** ***");
        }
    }

}
