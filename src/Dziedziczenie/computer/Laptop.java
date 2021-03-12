package Dziedziczenie.computer;

public class Laptop extends Computer{

    private int batteryLevel;

    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram); // konstruktor z klasy matki zawsze musi być pierwszy !
        this.batteryLevel = batteryLevel;
    }

    // Nadpisujemy metodę z klasy matki
    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level is too low!");
        }

    }

    public void setBatteryLevel(int newBatteryLevel) {
        this.batteryLevel = newBatteryLevel;
    }
}
