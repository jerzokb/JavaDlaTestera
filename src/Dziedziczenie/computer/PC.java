package Dziedziczenie.computer;

public class PC extends Computer{

    private boolean isPowerSupplyOn;

    // Klasa PC jest komputerem
    // PC ma dostęp do wszystkich publicznych pól i metod klasy matki

    public PC(String name, String type, int hdd, int ram) {
        super(name, type, hdd, ram); // wywołanie konstruktora w klasie matce
        this.isPowerSupplyOn = false;
    }

    public void setPowerSupply(boolean powerSupplyOn) {
        this.isPowerSupplyOn = powerSupplyOn;
    }

    // Nadpisujemy metodę z klasy matki
    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if(isPowerSupplyOn) {
            super.switchOn(); // wywołanie metody z klasy matki
        } else {
            System.out.println("Please plug in power supply!");
        }
    }

    public void showComputerName() {
        System.out.println(name);
    }

}
