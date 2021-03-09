package Model;

public class User {

    // 1. Pola obiketu to definicja obiektu
    // Typ nazwa = nowy obiekt

    private String firstName;
    private String lastName;
    private String emial;
    private int age;
    private boolean isAdult;

    // 3. Konstruktor domyślny tworzy pusty obiekt
    // Nazwa konstruktora jest taka sama jak nazwa klasy
    // Piszemy ja wielka litera
    // Konstruktor nie zwraca typu
//    Model.User() {
//
//    }
    // Jesli napiszemy wlasny konstruktor to nigdy juz nie zadziala domyslny konstruktor

    public User(String firstName, String lastName, String emial, int age) {
        System.out.println(firstName + " " + lastName + " " + emial + " " + age + " " + isAdult);
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    // SETTER
    public void setEmial(String email) {
        if (email.endsWith("ru")) {
            System.out.println("RU address emials is not allowed");
        } else {
            this.emial = email;
        }
    }

    // GETTER
    public String getEmial() {
        return emial;
    }

    // 2. Metody
    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + emial + " " + age + " " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if(age < 18) {
            return false;
        } else {
            return true;
        }
    }
    public void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    public void greetings(String firstname, String lastname) {
        System.out.println("Hi " + firstname + " " + lastname + ". Nice to see you!");
    }

    public void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old.");
    }

    public int yourAgePlusTen(int userAge) {
        return userAge + 10;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
