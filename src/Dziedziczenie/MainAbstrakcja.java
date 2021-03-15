package Dziedziczenie;

import Dziedziczenie.computer.*;

public class MainAbstrakcja {

    public static void main(String[] args) {

        // ABSTRAKCJA vs. KONKRETNE ROZWIĄZANIA

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        Computer officeComputer = new PC("Office computer", "HP", hdd, ram);
        Computer gamingLaptop = new Laptop("XGames", "HP GAMES", hdd, ram, 100);

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
