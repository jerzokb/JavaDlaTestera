import Model.User;

public class MainApp {

    // punkt startowy każdej aplikacji javovej to public statci void main - psvm + tabulator
    public static void main(String[] args) {
        // sout + tabulator
        // CTRL + D - kopiowanie linii
        System.out.println("Hello World");

        // liczby calkowite
        byte b;
        short s;
        int i;
        long l;
        int number = 10; // deklaracja i inicjalizacja zmiennej
        System.out.println(number);

        //liczby zmiennoprzecinkowe
        float f;
        double d;
        double doubleNumber = 10.5;
        System.out.println(doubleNumber);

        // text
        String someText = "tekst w javie";
        System.out.println(someText);

        // znak
        char someChar = 's';
        System.out.println(someChar);

        // prawda
        boolean trueValue = true;
        System.out.println(trueValue);

        // fałsz
        boolean falseValue = false;
        System.out.println(falseValue);

        // Operatory matematyczne
        System.out.println(10 + 10);
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);
        System.out.println(10.0 / 4.0);
        double x = 10;
        double z = 4;
        System.out.println(x / z);

        // Operatory porównania
        int numOne = 1;
        int numTwo = 2;
        System.out.println(numOne > numTwo);
        System.out.println(numOne < numTwo);
        System.out.println(numOne == numTwo);
        System.out.println(numOne != numTwo);

        // Operatory logiczne - || - lub; && - i
        System.out.println(numOne > numTwo || numOne == 1);
        System.out.println(numOne > numTwo || numOne != 1);
        System.out.println(numOne < numTwo || numOne != 1);
        System.out.println(numOne < numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne == 1);
        System.out.println(numOne > numTwo && numOne != 1);
        System.out.println(numOne < numTwo && numOne != 1);

        if(numOne < numTwo) {
            System.out.println("number ONE is less than number TWO");
        } else {
            System.out.println("number ONE is greater than number TWO");
        }

        String homePage = "Home";
        String loginPage = "Login";
        String contactPage = "Contact";

        String page = loginPage;
        switch (page) {
            case "Home":
                System.out.println("Przelaczam sie do strony Home");
                break;
            case "Login":
                System.out.println("Przelaczam sie do strony Login");
                break;
            case "Contact:":
                System.out.println("Przelaczam sie do strony Contact");
                break;
            default:
                System.out.println("Nie znam takiej strony");
        }
        // Nazwy klas: Model.User, SuperUser, AdminUser
        // Nazwy zmiennych: user, superUser, adminUser, isTrue
        // CTRL + ALT + L - formatowanie kodu

        // Operator modulo - reszta z dzielenia
        System.out.println(10 % 5);
        System.out.println(10 % 3);
        System.out.println(10 % 4);

        if(10 % 2 == 0) {
            System.out.println("jest liczba parzysta");
        } else {
            System.out.println("jest liczba nieparzysta");
        }

        User beata = new User("Beata", "Testowa", "beata@test.pl", 47);
        beata.getFullName();
        beata.getAllInfo();
        System.out.println(beata.getUserAge());
        boolean userAdult = beata.isUserAdult();
        System.out.println("Czy Beata jest dorosła? " + userAdult);

        User bartek = new User("Bartek", "Testowy", "bartek@test.pl", 17);
        bartek.getFullName();
        bartek.getAllInfo();
        int userAge = bartek.getUserAge();
        System.out.println(userAge);
    }
}
