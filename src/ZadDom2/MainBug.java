package ZadDom2;

import ZadDom2.Model.Bug;
import ZadDom2.Model.BugReporter;

public class MainBug {
    public static void main(String[] args) {

        BugReporter bugReporter1 = new BugReporter("Gertruda", "Symanska", "GertrudaSymanska@dayrep.com");
        BugReporter bugReporter2 = new BugReporter("Donat", "Gorski", "DonatGorski@teleworm.us");
        BugReporter bugReporter3 = new BugReporter("Luiza", "Ostrowska", "LuizaOstrowska@dayrep.com");
        BugReporter bugReporter4 = new BugReporter("Marcelina", "Kowalska", "MarcelinaKowalska@jourrapide.com");
        BugReporter bugReporter5 = new BugReporter("Teodozja", "Kalinowska", "TeodozjaKalinowska@armyspy.com");
        BugReporter bugReporter6 = new BugReporter("Frydrych", "Kozłowski", "FrydrychKozlowski@rhyta.com");

        System.out.println("***** ***");
        Bug bug1 = new Bug("Can't log-in to app", bugReporter1, 1);
        System.out.println(bug1);
        bug1.setBugDesc("New issue");
        System.out.println(bug1.getBugDesc());

        System.out.println("***** ***");
        Bug bug2 = new Bug("Change password function is missing", bugReporter2, 2);
        System.out.println(bug2);
        System.out.println(bug2.getReporter());
        bugReporter2.setOwnerEmail("DonatGorski/teleworm.us");
        System.out.println(bug2.getReporter());

        System.out.println("***** ***");
        Bug bug3 = new Bug("The index is not autoincremented", bugReporter3, 3);
        System.out.println(bug3);
        bug3.showBugStatus();
        bug3.NotifyStatusChange("In Progress");
        System.out.println(bug3.getBugStatus());

        System.out.println("***** ***");
        Bug bug6 = new Bug("The index is not autoincremented", bugReporter6, 3);
        System.out.println(bug6);
        bug6.showBugStatus();
        bug6.NotifyStatusChange("Close");
        System.out.println(bug6.getBugStatus());

        System.out.println("***** ***");
        Bug bug4 = new Bug("The message is not understandable", bugReporter4, 4);
        System.out.println(bug4);
        bug4.showBugPriority(bug4.getBugPriority());
        bug4.setBugPriority(7);
        System.out.println(bug4.getBugPriority());

        System.out.println("***** ***");
        Bug bug5 = new Bug("Icon on the menu is not as designed", bugReporter5, 5);
        System.out.println(bug5);
        bug5.changeStatus();
        bug5.showBugStatus();
        System.out.println(bug5.getBugPriority());

    }
}
