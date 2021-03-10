package ZadDom2.Model;

public class Bug {

    // POLA OBIEKTU - ustawione jako prywatne
    private String bugDesc; // opis błędu
    private String ownerEmail; // adres emial osoby zgłaszającej błąd
    private int bugPriority; // priorytet błędu (1-5)
    private String bugStatus; // Status błędu (otwarty / zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    // KONSTRUKTOR - publiczny
    public Bug(String bugDesc, String ownerEmail, int bugPriority) {
        this.bugDesc = bugDesc;
        this.ownerEmail = ownerEmail;
        this.bugPriority = bugPriority;
        this.bugStatus = "Open";
    }

    // METODY - publiczne
    public void showBugInfo() {
        System.out.println("Bug information:");
        System.out.println("Description: " + bugDesc);
        System.out.println("Bug owner: " + ownerEmail);
        System.out.println("Bug priority: " + bugPriority);
        System.out.println("Bug status: " + bugStatus);
        System.out.println("***** ***");
    }

    public void showBugOwner() {
        System.out.println("Bug owner: " + ownerEmail);
        System.out.println("***** ***");
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
        System.out.println("***** ***");
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void showBugPriority(int p) {
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

    public void changeStatus() {
        if (this.bugStatus == "Open") {
            this.bugStatus = "Close";
        } else if (this.bugStatus == "Close") {
            this.bugStatus = "Open";
        } else {
            System.out.println("Status not recognized!");
            System.out.println("***** ***");
        }
    }

    public String getBugDesc() {
        return bugDesc;
    }

    public void setBugDesc(String bugDesc) {
        if (bugDesc.length() < 10) {
            System.out.println("Description MUST be longer than 10 characters!");
        } else {
            this.bugDesc = bugDesc;
        }
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        if (!ownerEmail.contains("@")) {
            System.out.println("Email adrress MUST contain @ sign!");
        } else {
            this.ownerEmail = ownerEmail;
        }
    }

    public void setBugPriority(int bugPriority) {
        if ((1 > bugPriority) || (bugPriority > 5)) {
            System.out.println("Bug priority is not correct! MUST be 1 or 2 or 3 or 4 or 5.");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        if (bugStatus != "Open" && bugStatus != "Close") {
            System.out.println("Status not recognized!");
        } else {
            this.bugStatus = bugStatus;
        }
    }
}
