import Model.Bug;
import Model.BugReporter;

public class MainZadDom10_2 {
    public static void main(String[] args) {
        // 4. Utworzyć własny wyjątek IllegalBugPriorityException i rzucić go z klasy Bug z metody setBugPriority
        System.out.println("----------");
        Bug bug = new Bug("Can't install app", new BugReporter("Donat", "Gorski", "DonatGorski@teleworm.pl"), 1);
        bug.setBugPriority(-1);
    }
}
