package Dziedziczenie;

import Dziedziczenie.computer.*;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

        // 1. IS A - jest czymś - DZIEDZICZENIE
        // 2. HAS A - posiasa coś - KOMPOZYCJA
        // Hej mamo - jesteś SUPER!

        // referencja do obiektu = obiekt w pamięci

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        PC officeComputer = new PC("Office computer", "HP", hdd, ram);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", hdd, ram, 80);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.showComputerName();

        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());

        gamingLaptop.switchOff();

        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());

        // POLOMORFIZM - wiele form
        // Do jednego typu zmiennej możemy przypisać obiekty z różnych klas
        // Natomiast te obiekty muszą dziedziczyć po jednej klasie
        // I referencja do obiektu musi być takiego typu jak jest klasa nadrzędna - matka
        // Mamy dostęp do metod klasy matki i nadpisanych metod przez klasy - dzieci
        // odczytujemy najpierw metody w klasie-dziecko, potem w klasie matce

        Computer officeComputer1 = new PC("Office computer 1", "HP", hdd, ram);
        Computer officeComputer2 = new PC("Office computer 2", "HP", hdd, ram);
        Computer officeComputer3 = new PC("Office computer 3", "HP", hdd, ram);
        Computer gamingLaptop1 = new Laptop("XGames 1", "HP GAMES", hdd, ram, 80);
        Computer mackbook = new Laptop("MB PRO", "PRO", hdd, ram, 100);

        Computer[] computers = {officeComputer1, officeComputer2, officeComputer3, gamingLaptop1, mackbook};

        for (Computer computer : computers) {
            computer.switchOff();
        }

        // Jeśli mamy metodę tylko w klasie dziecko, nie mamy w klasie matce
        // Musi nastąpić jawna zamiana na klasę dziecko
        // Rzutowanie - zmiana typu referencji
        ((PC)officeComputer2).showComputerName();


    }
}
