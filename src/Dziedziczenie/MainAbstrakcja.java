package Dziedziczenie;

import Dziedziczenie.computer.Computer;
import Dziedziczenie.computer.Laptop;
import Dziedziczenie.computer.PC;

public class MainAbstrakcja {

    public static void main(String[] args) {

        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        Computer officeComputer = new PC("Office computer", "HP", 500, 128);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 100);

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
    }
}
