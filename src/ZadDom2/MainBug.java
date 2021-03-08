package ZadDom2;

public class MainBug {
    public static void main(String[] args) {

        Bug bug1 = new Bug("Can't log-in to app", "beata@test.pl", 1);
        bug1.showBugInfo();

        Bug bug2 = new Bug("Change password function is missing", "aneta@test.pl", 2);
        bug2.showBugOwner();

        Bug bug3 = new Bug("The index is not autoincremented", "kasia@test.pl", 3);
        bug3.showBugStatus();

        Bug bug4 = new Bug("The message is not understandable", "ewa@test.pl", 4);
        bug4.showBugPriority(bug4.bugPriority);

        Bug bug5 = new Bug("Icon on the menu is not as designed", "natalia@test.pl", 5);
        bug5.changeStatus();
        bug5.showBugStatus();

    }
}
