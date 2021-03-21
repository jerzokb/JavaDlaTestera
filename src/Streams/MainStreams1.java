package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreams1 {
    public static void main(String[] args) {
        // STREAMY - STRUMIENIE WARTOSCI
        // Zamiana listy na strumień
        // Wykonanie akcji na strumieniu
        // metody pośrednie zwracają nowy stream
        // filter - filtrowanie elementów
        // map - przekształcenie elementów
        // metody terminalne - wykonywane jako ostatnie, zwracają wartość. pozwalają zebrać wartości do kolekcji
        // forEach - wyświetlanie elementów
        // min | max | sum
        // anyMatch | allMatch | nonMatch
        // count
        // collect - zbieranie elementów

        List<String> names = new ArrayList<>();
        names.add("Bartek");
        names.add("Antek");
        names.add("Filip");
        names.add("Tom");
        names.add("Franek");
        names.add("Feliks");
        names.add("Romek");
        names.add("Max");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));
        System.out.println("^.^");

        names.stream()
                .map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));
        System.out.println("^.^");

        names.stream()
                .filter(str -> str.length() <= 3)
                .map(str -> "Short name: " + str)
                .forEach(str -> System.out.println(str));
        System.out.println("^.^");

        long count = names.stream()
                .filter(str -> str.length() <= 3)
                .count();
        System.out.println(count);
        System.out.println("^.^");

        boolean anyMatch = names.stream()
                .anyMatch(s -> s.contains("a"));
        System.out.println(anyMatch);
        System.out.println("^.^");

        boolean allMatch = names.stream()
                .allMatch(s -> s.length() > 2);
        System.out.println(allMatch);
        System.out.println("^.^");

        boolean noneMatch = names.stream()
                .noneMatch(s -> s.endsWith("ski"));
        System.out.println(noneMatch);
        System.out.println("^.^");

        List<String> fNames = names.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(fNames);
        System.out.println("^.^");

    }
}
