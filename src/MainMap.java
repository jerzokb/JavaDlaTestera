import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainMap {
    public static void main(String[] args) {
        // MAPA - ZBIÓR KLUCZ + WARTOść

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Bartek1");
        names.put(10, "Bartek10");
        names.put(20, "Bartek20");
        names.put(0, "Bartek0");
        names.put(5, "Bartek5");
        names.put(20, "Bartek222"); // stara wartość zostanie nadpisana nową wartością

        System.out.println(names);

        Map<Integer, String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);

        Map<Integer, String> orderNames = new LinkedHashMap<>(names);
        System.out.println(orderNames);

        for (Map.Entry<Integer, String> entry : names.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
