package Streams;

import Model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStrams2 {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Bartek", "Biały", "bartek@test.com", 10));
        users.add(new User("Tomek", "Czarny", "tomek@test.com", 12));
        users.add(new User("Marcin", "Niebieski", "marcin@test.com", 13));
        users.add(new User("Jacek", "Fioletowy", "jacek@test.com", 14));
        users.add(new User("Asia", "Zielona", "asia@test.com", 16));
        users.add(new User("Asia", "Zielona", "asia@test.com", 11));
        users.add(new User("Asia", "Miętowa", "asia@test.com", 16));
        users.add(new User("Marta", "Czerwona", "marta@test.com", 17));
        users.add(new User("Kasia", "Pmarańczowa", "kasia@test.com", 18));
        System.out.println("*****");

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparing(User::getFirstName).thenComparing(User::getLastName).thenComparing(User::getAge))
                .collect(Collectors.toList());

        for (User user : sortedUsers) {
            System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getAge());
        }
        System.out.println("*****");

        users.stream()
                .sorted(Comparator.comparing(User::getLastName)) // Referencja do metody
                .forEach(System.out::println);
    }
}
