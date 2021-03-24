package Model;

import exceptions.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug>{

    // Zadanie Domowe 7
    // 1. Dodanie klasy BugReporter + 3 pola + 3 dodatkowe metody + walidacja maila przeniesiona z BUG
    // 2. Dodanie interface ConsoleNotification -> notifyStatusChange
    // 3. W klasie Bug dodać metody toString

    // POLA OBIEKTU - ustawione jako prywatne
    private String bugDesc; // opis błędu
    private BugReporter reporter; // adres emial osoby zgłaszającej błąd
    private int bugPriority; // priorytet błędu (1-5)
    private String bugStatus; // Status błędu (otwarty / zamknięty) - domyślnie, podczas tworzenia zawsze otwarty

    // KONSTRUKTOR - publiczny
    public Bug(String bugDesc, BugReporter reporter, int bugPriority) {
        this.bugDesc = bugDesc;
        this.reporter = reporter;
        this.bugPriority = bugPriority;
        this.bugStatus = "Open";
    }

    // METODY - publiczne
    public void showBugInfo() {
        System.out.println("Bug information:");
        System.out.println("Description: " + bugDesc);
        System.out.println("Bug owner: " + reporter);
        System.out.println("Bug priority: " + bugPriority);
        System.out.println("Bug status: " + bugStatus);
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

    public int getBugPriority() {
        return bugPriority;
    }

    public void showBugPriority(int p) {
        switch (p) {
            case 1:
                System.out.println("Priority " + p + "-HIGHEST");
                break;
            case 2:
                System.out.println("Priority " + p + "-HIGH");
                break;
            case 3:
                System.out.println("Priority " + p + "-MEDIUM");
                break;
            case 4:
                System.out.println("Priority " + p + "-LOW");
                break;
            case 5:
                System.out.println("Priority " + p + "-LOWEST");
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

    public BugReporter getReporter() {
        return reporter;
    }

    public void setReporter(BugReporter reporter) {
        this.reporter = reporter;
    }

    public void setBugPriority(int bugPriority) throws IllegalBugPriorityException {
        if ((1 > bugPriority) || (bugPriority > 5)) {
            throw new IllegalBugPriorityException("Bug priority is not correct! MUST be 1 or 2 or 3 or 4 or 5.");
            // System.out.println("Bug priority is not correct! MUST be 1 or 2 or 3 or 4 or 5.");
        } else {
            this.bugPriority = bugPriority;
        }
    }

    public String getBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(String bugStatus) {
        notifyStatusChange(bugStatus);
        if (bugStatus == "Open" || bugStatus == "Close") {
            this.bugStatus = bugStatus;
        }
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDesc='" + bugDesc + '\'' +
                ", reporter=" + reporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus='" + bugStatus + '\'' +
                '}';
    }

    @Override
    public void notifyStatusChange(String bugStatus) {
        if (bugStatus != "Open" && bugStatus != "Close") {
            System.out.println("Status not recognized!");
        } else {
            System.out.println("Status został zmieniony!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority &&
                Objects.equals(bugDesc, bug.bugDesc) &&
                Objects.equals(reporter, bug.reporter) &&
                Objects.equals(bugStatus, bug.bugStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDesc, reporter, bugPriority, bugStatus);
    }

    @Override
    public int compareTo(Bug bug) {
        // int compareResult = this.getBugDesc().compareTo(bug.bugDesc); // niepotrzebnie tworzę zmienną
        // return compareResult;
        return this.getBugDesc().compareTo(bug.bugDesc);
    }
}
