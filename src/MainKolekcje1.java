import Model.User;

import java.util.*;

public class MainKolekcje1 {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mikołaj", "Walczak", "MikolajWalczak@teleworm.us", 35));
        users.add(new User("Ludwik", "Pawlak", "LudwikPawlak@rhyta.com", 82));
        users.add(new User("Ruta", "Adamczyk", "RutaAdamczyk@teleworm.us", 37));
        users.add(new User("Klaudiusz", "Majewski", "KlaudiuszMajewski@dayrep.com", 46));

        for (User user : users) {
            System.out.println(user.getFirstName());
        }

        Collections.sort(users, Comparator.comparing(User::getFirstName));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(User::getAge));
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }

        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
        for (User user : users) {
            System.out.println(user.getFirstName() + " " + user.getAge());
        }
    }
}
