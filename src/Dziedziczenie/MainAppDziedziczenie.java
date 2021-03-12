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

        // Utworzony officeComputer isPowerSupplyOn = false
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        // Ustawiam isPowerSupplyOn = true
        officeComputer.setPowerSupply(true);
        officeComputer.switchOn();
        System.out.println(officeComputer.getState());

        officeComputer.showComputerName();

        // Battery level = 80
        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());

        // Wyłączam laptop
        gamingLaptop.switchOff();

        // Rozładowuję baterię i próbuję włączyć
        gamingLaptop.setBatteryLevel(0);
        gamingLaptop.switchOn(); // najpierw sprawdza w klasie dziecko, potem w klasie matce
        System.out.println(gamingLaptop.getState());
    }
}
