import java.util.Random;

public class MainApp1 {
    public static void main(String[] args) {
        // 1. 4. Zmienne typu int
        // 2. Sprwadź czy suma dwóch pierwszych jest parzysta
        // 3. Sprawdź czy suma dwóch pozostałych jest parzysta
        // 4. Jeżeli dwie sumy są parzyste to wyświetl informację, że wszystkie liczby są parzyste

        int intOne = 75954;
        int intTwo = 42595;
        int intThree = 74562;
        int intFour = 35418;
        System.out.println("Pierwsza liczba: " + intOne);
        System.out.println("Druga liczba: " + intTwo);
        System.out.println("Trzecie liczba: " + intThree);
        System.out.println("Czwarta liczba: " + intFour);

        boolean isTrueSumOne = ((intOne + intTwo) % 2 == 0);
        boolean isTrueSumTwo = ((intThree + intFour) % 2 == 0);
        if(isTrueSumOne) {
            System.out.println("Suma dwóch pierwszych liczb jest parzysta");
        }
        if (isTrueSumTwo) {
            System.out.println("Suma dwóch pierwszych liczb jest parzysta");
        }
        if(isTrueSumOne && isTrueSumTwo) {
            System.out.println("Wszystkie liczby są parzyste");
        } else {
            System.out.println("Przynajmniej jedna liczba jest nieparzysta");
        }
    }
}
