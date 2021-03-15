package Dziedziczenie.computer;

public class PC extends Computer{

    // Klasa PC jest komputerem
    // PC ma dostęp do wszystkich publicznych pól i metod klasy matki

    public PC(String name, String type, Hdd hdd, Ram ram) {
        super(name, type, hdd, ram); // wywołanie konstruktora w klasie matce
    }

    // Nadpisujemy metodę z klasy matki
    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        super.switchOn(); // wywołanie metody z klasy matki
    }

    public void switchOff() {
        System.out.println("Wyłączam PC: " + name);
        state = false;
    }

    public void showComputerName() {
        System.out.println(name);
    }

    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 1;
        if (volumeLevel <= 0) {
            return 0;
        } else {return volumeLevel;}

    }


}
