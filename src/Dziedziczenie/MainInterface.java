package Dziedziczenie;

import Dziedziczenie.computer.Computer;
import Dziedziczenie.computer.Hdd;
import Dziedziczenie.computer.Laptop;
import Dziedziczenie.computer.Ram;

public class MainInterface {
    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        Laptop laptop = new Laptop("XGames", "HP GAMES", hdd, ram, 100);
        Computer mac = new Laptop("Mac", "Pro",
                new Hdd("Samsung", 500),
                new Ram("AAA", 128), 50);

        System.out.println(laptop.getRam().getSize());

        laptop.playMusic();
        laptop.pauseMusic();
        laptop.stopMusic();

        laptop.sayHalloFromMusic();

        laptop.playVideo();
        laptop.pauseVideo();
        laptop.stopVideo();

        laptop.sayHalloFromVideo();

        laptop.sayHallo();
    }
}
