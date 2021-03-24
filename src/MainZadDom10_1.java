import Model.Bug;
import Model.BugReporter;
import Model.User;
import enums.Gender;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainZadDom10_1 {
    public static void main(String[] args) {
        // ENUM
        // 1. Utworzyć nowy enum - gender - m, K
        // 2. W klasie User dodać nowe pole enum Gender + gettery i settery
        // 3. Utworzyć nowy konstruktor, który jako kolejny parametr przyjmie enuma
        // 4. Utworzyć listę kilku użytkowników
        // 5. W streamie wyszukać tylko kobiety

        List<User> users = new ArrayList<>();
        users.add(new User("Gabrysia", "Król", "GabrysiaKrol@dayrep.com", 50, true, Gender.K));
        users.add(new User("Celestyn", "Maciejewski", "CelestynMaciejewski@armyspy.com", 62, true, Gender.M));
        users.add(new User("Felicja", "Nowakowska", "FelicjaNowakowska@teleworm.us ", 63, true, Gender.K));
        users.add(new User("Bronisława", "Kwiatkowska", "BronislawaKwiatkowska@jourrapide.com", 55, true, Gender.K));
        users.add(new User("Gabrysz", "Majewski", "GabryszMajewski@dayrep.com", 38, true, Gender.M));
        users.add(new User("Gaweł", "Michalski", "GawelMichalski@jourrapide.com", 49, true, Gender.M));
        users.add(new User("Gabriela", "Zając", "GabrielaZajac@jourrapide.com", 75, true, Gender.K));

        users.stream()
                .filter(user -> user.getGender().equals(Gender.K))
                .forEach(user -> System.out.println("Kobieta: " + user.getFirstName() + " " + user.getLastName()));

        // WYJĄTKI
        // 1. Utworzyć nowy plik txt z imionami (BufferedWriter)
        // 2. Wczytać imiona do listy
        // 3. W streamie sprawdzić czy lista zawiera jakieś imię, jeżeli nie to rzucić wyjątkiem

        File file;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("names.txt"));
            bufferedWriter.write("Walerian");
            bufferedWriter.newLine();
            bufferedWriter.write("Albina");
            bufferedWriter.newLine();
            bufferedWriter.write("Roksana");
            bufferedWriter.newLine();
            bufferedWriter.write("Czesław");
            bufferedWriter.newLine();
            bufferedWriter.write("Klementyna");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> names = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("names.txt"));
            String line = bufferedReader.readLine();
            while(line != null) {
                names.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("----------");
        System.out.println("Wszystkie imiona z pliku");
        names.stream()
                .forEach(name -> System.out.println(name));

        names.stream()
                .filter(name -> name.equalsIgnoreCase("Beata"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Beaty nie ma na liście"));
    }
}
