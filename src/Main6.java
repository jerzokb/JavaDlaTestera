import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        // Typy opakowujące

        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;

        int number = 10;
        // Auto boxing - zamiama typu prostego na złożony
        Integer intNumber = Integer.valueOf(10);
        System.out.println(intNumber);
        Integer intNumber1 = 20;

        Double dbl = Double.valueOf(1.23);
        System.out.println(dbl);

        // Auto unboxing - zamiana referencyjnego na prosty
        int newNumber = intNumber.intValue();
        double newDouble = dbl.doubleValue();

        List<Integer> numbers = new ArrayList<>();
    }
}
