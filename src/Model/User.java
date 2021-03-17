package Model;

import java.util.Objects;

public class User implements Comparable<User>{

    // 1. Pola obiketu to definicja obiektu
    // Typ nazwa = nowy obiekt

    private static int userCounter = 0; // pola statyczne należą do klasy a nie do obiektu

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
        userCounter++;
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

    // Metoda statyczna należy do klasy
    public static int getUserCounter() {
        return userCounter;
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emial='" + emial + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                isAdult == user.isAdult &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(emial, user.emial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, emial, age, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareResult = this.getFirstName().compareTo(user.firstName);
        if (compareResult == 0) {
            compareResult = this.getLastName().compareTo(user.lastName);
        }
        return compareResult;
    }
}
