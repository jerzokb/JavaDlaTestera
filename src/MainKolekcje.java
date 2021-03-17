import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainKolekcje {
    public static void main(String[] args) {
        // KOLEKCJA - ZBIÓR ELEMENTÓW TEGO SAMEGO TYPU -> ELEMENT1, ELEMENT2, ELEMENT3
        // LIST - ARRAY LIST

        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Karol");
        names.add("Benedykta");
        names.add("Amadei");
        names.add("Jakub");

        names1.add("Benedykta");
        names1.add("Amadei");

        // names.remove(0);
        // names.remove("Amadei");

        String imie = names.get(1);
        System.out.println(imie);

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println( names.contains("Jakub"));


        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }

        names.addAll(names1);

        Collections.sort(names);
        Collections.reverse(names);
        System.out.println(names);

        // names.removeAll(names1);
        // System.out.println(names);
    }
}
