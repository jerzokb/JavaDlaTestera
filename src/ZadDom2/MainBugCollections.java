package ZadDom2;

import ZadDom2.Model.Bug;
import ZadDom2.Model.BugReporter;

import java.util.*;

public class MainBugCollections {

    public static void main(String[] args) {
        // 1. Utwórz listę bugów, która będzie zawierać przynajmniej dwa identyczne bugi

        List<BugReporter> bugReporters = new ArrayList<>();
        bugReporters.add(new BugReporter("Wioletta", "Kozłowska", "WiolettaKozlowska@dayrep.com"));
        bugReporters.add(new BugReporter("Kazimiera", "Sobczak", "KazimieraSobczak@jourrapide.com"));
        bugReporters.add(new BugReporter("Amadei", "Kalinowski", "AmadeiKalinowski@armyspy.com"));
        bugReporters.add(new BugReporter("Radomił", "Czerwiński", "RadomilCzerwinski@jourrapide.com "));

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("301 - Moved permanently", bugReporters.get(0), 1));
        bugs.add(new Bug("400 - Bad request", bugReporters.get(2), 2));
        bugs.add(new Bug("405 - Method not allowed", bugReporters.get(1), 3));
        bugs.add(new Bug("500 - Internal server error", bugReporters.get(3), 4));
        bugs.add(new Bug("501 – Not implemented", bugReporters.get(0), 5));
        bugs.add(new Bug("429 - Too many requests", bugReporters.get(2), 3));
        bugs.add(new Bug("401 - Unauthorized", bugReporters.get(3), 1));
        bugs.add(new Bug("500 - Internal server error", bugReporters.get(3), 4));
        bugs.add(new Bug("401 - Unauthorized", bugReporters.get(3), 1));

        System.out.println("All bugs list size: " + bugs.size());
        for (Bug bug : bugs) {
            System.out.println(bug);
        }
        System.out.println("^.^");

        // Wyciągnij listę tylko unikaltnych bugów
        Set<Bug> uniqueBugs = new HashSet<>(bugs);
        System.out.println("Unique bugs list size: " + uniqueBugs.size());
        for (Bug bug : uniqueBugs) {
            System.out.println(bug);
        }
        System.out.println("^.^");

        // Posortuj unikalne bugi po bug description
        Set<Bug> sortedBugs = new TreeSet<>(uniqueBugs);
        System.out.println("Sorted unique bugs list size: " + uniqueBugs.size());
        for (Bug bug : sortedBugs) {
            System.out.println(bug);
        }
    }
}
