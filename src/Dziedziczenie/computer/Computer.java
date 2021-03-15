package Dziedziczenie.computer;

// Klasa matka
// Klasa abstrakcyjna - inne klasy mogę po niej dziedziczyć
// Tylko opisuje obiekty
// NIE służy do tworzenia konkretnych obiektów
// Ale możemy jej używać do typów referencji
abstract public class Computer {

    // protected - aby pola z klasy matki były dostępne w klasie potomnej

    protected String name;
    protected String type;
    protected Hdd hdd;
    protected Ram ram;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("SUPER - ustawiam pole state na true");
        state = true;
    }

    public void switchOff() {
        System.out.println("Wyłączam komputer: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    // Metody abstrakcyjne nie mają ciała
    // Bo w klasie abstrakcyjnej nie wiem co chcemy zrobić
    // Będzie wiedziała to klasa dziecko
    // Jeśli klasa posiada metodę abstrakcyjną, to klasa musi być abstrakcyjna
    // Każda klasa dziedzicząca musi ją zaimplementować - konkretne rozwiązanie dla każdej metody abstrakcyjnej
    public abstract int volumeUp();

    public abstract int volumeDown();
}
