import Model.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {
    public static void main(String[] args) {
        // SET - ZBIÓR UNIKALNYCH ELEMENTÓW
        // Nie ma kolejności elementów

        Set<String> names = new HashSet<>();

        names.add("Beata");
        names.add("Ewa");
        names.add("Monika");
        names.add("Aneta");
        names.add("Magda");
        names.add("Beata");

        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        Set<String> sortedNames = new TreeSet<>(names);

        for (String name : sortedNames) {
            System.out.println(name);
        }

        Set<User> users = new HashSet<>();

        users.add(new User("Mikołaj", "Walczak", "MikolajWalczak@teleworm.us", 35));
        users.add(new User("Mikołaj", "Walczak", "MikolajWalczak@teleworm.us", 35));
        users.add(new User("Hanna", "Pawlak", "LudwikPawlak@rhyta.com", 28));
        users.add(new User("Hanna", "Adamczyk", "RutaAdamczyk@teleworm.us", 37));
        users.add(new User("Klaudiusz", "Majewski", "KlaudiuszMajewski@dayrep.com", 46));
        users.add(new User("Hanna", "Kaczmarek", "HannaKaczmarek@dayrep.com", 38));

        System.out.println(users.size());

        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }

        Set<User> sortedUsers = new TreeSet<>(users);

        for (User user : sortedUsers) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}
