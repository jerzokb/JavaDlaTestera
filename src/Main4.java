import Model.User;

public class Main4 {

    public static void main(String[] args) {

        // MODYFIKATORY DOSTEPU - access modifiers
        // z ktorego miejsca bedziemy mogli dostac sie do pol lub wywolac metode
        // Domyslnie pola i metody sa widoczne tylko w jednym pakiecie
        // domyslny modifikator dziala tylko w obrębie jednego pakietu

        // PUBLIC modyfikator dostepu daje dostep do
        // kontruktora, pol i metod w calym projekcie
        // PROTECTED
        // PRIVATE - tylko w obrebie danej klasy
        // Pola powinny być prywatne

        // Enkapsulacja - ukrywanie danych poprzez ustawianie prywatnych pol obiektów
        // i tworzenie publicznych getterów i setterów

        User user = new User("Beata", "Testowa", "beata@test.pl", 47);
        user.getFullName();
        System.out.println(user.isUserAdult());

        System.out.println(user.getEmial());

        user.setEmial("nowy@testowy.ru");

        System.out.println(user.getEmial());
    }
}
