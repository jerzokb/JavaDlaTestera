package Dziedziczenie;

import Dziedziczenie.computer.Laptop;
import Dziedziczenie.computer.PC;

public class MainAppDziedziczenie {

    public static void main(String[] args) {

        // 1. IS A - jest czymś - DZIEDZICZENIE
        // 2. HAS A - posiasa coś - KOMPOZYCJA
        // Hej mamo - jesteś SUPER!

        PC officeComputer = new PC("Office computer", "HP", 500, 128);
        Laptop gamingLaptop = new Laptop("XGames", "HP GAMES", 500, 256, 80);

        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.showComputerName();

        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());

        gamingLaptop.switchOff();

        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());
    }
}
