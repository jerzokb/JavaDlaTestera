import Model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainWyjatki {
    public static void main(String[] args) {
        // WYJATKI - SYTUACJE WYJATKOWE

        // 1. DWA TYPY WYJATKOW (MUSIMY LAPAC I NIE MUSIMY LAPAC
        // 2. LAPANIE WYJATKOW
        // 3. RZUCANIE WYJATKOW
        // 4. DODANIE WYJATKU DO SYGNATURY METODY
        // 5. TWORZENIE WLASNYCH WYJATKOW

        // 1. MUSIMY LAPAC - Eception
        // FileNotFoundException();
        // IOException();

//        File file;
//        try {
//            // Potencjalnie niebezpieczna czesc kodu
//            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
//            String line = bufferedReader.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("TO WYKONA SIĘ ZAWSZE !!!");
//        }

//        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("test1.txt"));
//        String line = bufferedReader1.readLine();
//        while(line != null) {
//            System.out.println(line);
//            line = bufferedReader1.readLine();
//        }

        // 2. MIE MUSIMU LAPAC - RuntimeException
        // IllegalStateException(); - było w streamch
        // IllegalArgumentException(); - niedozwolony argument
        // NullPointerException();
        // IndexOutOfBoundException();
        // UnsupportedOperationException(); // metoda, której nie chcemy implementować

//        User user = new User("Mikołaj", "Walczak", "MikolajWalczak@teleworm.us", 35);
//        System.out.println(user.getFirstName());
//        user = null;
//        System.out.println(user.getFirstName());

//        List<String> names = new ArrayList<>();
//        names.add("Bartosz"); // index = 0
//        System.out.println(names.get(1));

//        List<String> names = new ArrayList<>();
//        names.add("Iwo");
//        names.add("Patrycja");
//        names.add("Martyn");
//
//        names.stream()
//                .filter(s -> s.startsWith("A"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("Can't find name"));

        User user = new User("Mikołaj", "Walczak", "MikolajWalczak@teleworm.us", 35);
        user.setEmial("MartynWieczorek@rhyta.ru");


    }
}
