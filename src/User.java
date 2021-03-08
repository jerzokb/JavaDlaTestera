public class User {

    // 1. Pola obiketu to definicja obiektu
    // Typ nazwa = nowy obiekt

    String firstName;
    String lastName;
    String emial;
    int age;
    boolean isAdult;

    // 3. Konstruktor domyślny tworzy pusty obiekt
    // Nazwa konstruktora jest taka sama jak nazwa klasy
    // Piszemy ja wielka litera
    // Konstruktor nie zwraca typu
//    User() {
//
//    }
    // Jesli napiszemy wlasny konstruktor to nigdy juz nie zadziala domyslny konstruktor

    User(String firstName, String lastName, String emial, int age) {
        System.out.println(firstName + " " + lastName + " " + emial + " " + age + " " + isAdult);
        this.firstName = firstName;
        this.lastName = lastName;
        this.emial = emial;
        this.age = age;
        this.isAdult = isUserAdult();
    }

    // 2. Metody
    void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    void getAllInfo() {
        System.out.println(firstName + " " + lastName + " " + emial + " " + age + " " + isAdult);
    }

    int getUserAge() {
        return age;
    }

    boolean isUserAdult() {
        if(age < 18) {
            return false;
        } else {
            return true;
        }
    }
    void greetings(String name) {
        System.out.println("Hi " + name + ". Nice to see you!");
    }

    void greetings(String firstname, String lastname) {
        System.out.println("Hi " + firstname + " " + lastname + ". Nice to see you!");
    }

    void howOldAreYou(String name, int userAge) {
        System.out.println("Hi " + name + ". You are " + userAge + " years old.");
    }

    int yourAgePlusTen(int userAge) {
        return userAge + 10;
    }
}
