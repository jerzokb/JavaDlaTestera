package Dziedziczenie.computer;

public class PC extends Computer{

    // Klasa PC jest komputerem
    // PC ma dostęp do wszystkich publicznych pól i metod klasy matki

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); // wywołanie konstruktora w klasie matce
    }

    // Nadpisujemy metodę z klasy matki
    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        super.switchOn(); // wywołanie metody z klasy matki
    }

    public void showComputerName() {
        System.out.println(name);
    }
}
