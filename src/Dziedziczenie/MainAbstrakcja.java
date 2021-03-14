package Dziedziczenie;

import Dziedziczenie.computer.Computer;
import Dziedziczenie.computer.Laptop;
import Dziedziczenie.computer.PC;

public class MainAbstrakcja {

    public static void main(String[] args) {

        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        Computer officeComputer = new PC("Office computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 100);
        Computer officeComputer1 = new PC("Office computer1", "HP", 500, 128);
        Computer gamingLaptop1 = new Laptop("XGames1", "HP GAMES", 500, 256, 100);

        System.out.println(gamingLaptop.volumeUp());

        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());
        System.out.println(gamingLaptop.volumeDown());

        System.out.println(officeComputer.volumeUp());
        System.out.println(officeComputer.volumeUp());

        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());
        System.out.println(officeComputer.volumeDown());

        System.out.println("Testuj dźwięk na PC");
        System.out.println("Zwiększam o 30: " + officeComputer1.volumeUp(30));
        System.out.println("Zwiększam o 40: " + officeComputer1.volumeUp(40));
        System.out.println("Zwiększam o 50 (przekroczyłem limit): " + officeComputer1.volumeUp(50));
        System.out.println("Zmniejszam o 60: " + officeComputer1.volumeDown(60));
        System.out.println("Zmniejszam o 40 (wracam do 0): " + officeComputer1.volumeDown(40));

        System.out.println();

        System.out.println("Testuj dźwięk na Laptopie");
        System.out.println("Zwiększam o 30: " + gamingLaptop1.volumeUp(30));
        System.out.println("Zwiększam o 40: " + gamingLaptop1.volumeUp(40));
        System.out.println("Zwiększam o 50 (nie wchodzę powyżej 100): " + gamingLaptop1.volumeUp(50));
        System.out.println("Zmniejszam o 60: " + gamingLaptop1.volumeDown(60));
        System.out.println("Zmniejszam o 50 (nie schodzę poniżej 0): " + gamingLaptop1.volumeDown(50));
        System.out.println("A jednak dajmy trochę głosu: " + gamingLaptop1.volumeUp(20));

        System.out.println();

        System.out.println("Próba wartości ujemnej: " + officeComputer1.volumeUp(-10));
        System.out.println("Próba wartości ujemnej: " + gamingLaptop1.volumeDown(-10));
    }
}
