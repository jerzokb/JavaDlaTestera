package ZadDom2;

import ZadDom2.Model.Bug;

public class MainBug {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Can't log-in to app", "beata@test.pl", 1);
        bug1.showBugInfo();
        bug1.setBugDesc("New issue");
        System.out.println(bug1.getBugDesc());

        Bug bug2 = new Bug("Change password function is missing", "aneta@test.pl", 2);
        bug2.showBugOwner();
        bug2.setOwnerEmail("kamil/test.pl");
        System.out.println(bug2.getOwnerEmail());

        Bug bug3 = new Bug("The index is not autoincremented", "kasia@test.pl", 3);
        bug3.showBugStatus();
        bug3.setBugStatus("In Progress");
        System.out.println(bug3.getBugStatus());

        Bug bug4 = new Bug("The message is not understandable", "ewa@test.pl", 4);
        bug4.showBugPriority(bug4.getBugPriority());
        bug4.setBugPriority(7);
        System.out.println(bug4.getBugPriority());

        Bug bug5 = new Bug("Icon on the menu is not as designed", "natalia@test.pl", 5);
        bug5.changeStatus();
        bug5.showBugStatus();
        System.out.println(bug5.getBugPriority());

    }
}
