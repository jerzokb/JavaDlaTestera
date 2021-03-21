package Optional;

import Model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainOptional1 {
    public static void main(String[] args) {
        // Optional - opakowanie dla obiektu
        // Optional[obiekt] / Optional[]
        // Zabezpieczenie przed null'ami

        List<User> users = new ArrayList<>();

        users.add(new User("Bartek", "Biały", "bartek@test.com", 10));
        users.add(new User("Tomek", "Czarny", "tomek@test.com", 12));
        users.add(new User("Marcin", "Niebieski", "marcin@test.com", 13));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.com", 14));
        users.add(new User("Asia", "Zielona", "asia@test.com", 16));
        users.add(new User("Asia", "Zielona", "asia@test.com", 11));
        users.add(new User("Asia", "Miętowa", "asia@test.com", 16));
        users.add(new User("Marta", "Czerwona", "marta@test.com", 17));
        users.add(new User("Kasia", "Pmarańczowa", "kasia@test.com", 90));
        System.out.println("*****");

        Optional<User> max = users.stream()
                .max(Comparator.comparing(User::getAge));
        // get()
        // isPresent()
        // isEmpty()
        // orElse()
        // orElseGet()
        // orElseThrow()

        // FunctionalInterface
        // Predicate - pobiera jedną wartość i zwraca boolean
        // Consumer - pobiera jedną wartość i nic nie zwraca (sout)
        // Supplier - dostarcza wartość

        // ifPresent()
        // ifPresentOrElse()
        // findFirst()

        if(max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("Nie znalazłem elementu");
        }
        System.out.println("*****");

        String kasia = users.stream()
                .map(User::getFirstName)
                .filter(s -> s.equals("Kasia"))
                .findFirst()
                .orElse("Nie ma Kasi na liście");
        System.out.println(kasia);
        System.out.println("*****");

        Integer age = users.stream()
                .map(User::getAge)
                .max(Integer::compareTo)
                .orElse(-1);
        System.out.println(age);
        System.out.println("*****");

        User bartek = users.stream()
                .filter(user -> user.getFirstName().startsWith("B"))
                .findFirst()
                .orElseGet(() -> new User("BartekGet", "TestowyGer", "bartektestowy@test.com", 19));
        System.out.println(bartek);
        System.out.println("*****");

        User bartek1 = users.stream()
                .filter(user -> user.getFirstName().startsWith("B"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Na liście nie ma osoby z imieniem na literę B"));
        System.out.println(bartek1);
        System.out.println("*****");

        users.stream()
                .filter(user -> user.getFirstName().startsWith("B"))
                .findFirst()
                .ifPresent(user -> System.out.println(user));
        System.out.println("*****");

        users.stream()
                .filter(user -> user.getFirstName().startsWith("B"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("Nie ma takiego usera"));
        System.out.println("*****");

        users.stream()
                .filter(user -> user.getFirstName().startsWith("Z"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("Nie ma takiego usera"));
    }
}
