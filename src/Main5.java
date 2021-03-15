import Model.User;
import utils.StringUtils;
import utils.WeekUtils;

public class Main5 {
    public static void main(String[] args) {
        // PĘTLE WHILE i DO - WHILE

        int i = 10;

        while(i < 20) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("jestem w do");
            System.out.println(i);
            i++;
        } while(i < 20);

        User u1 = new User("Beata1", "Testowa1", "beata1@test.pl", 41);
        User u2 = new User("Beata2", "Testowa2", "beata2@test.pl", 42);
        User u3 = new User("Beata3", "Testowa3", "beata3@test.pl", 43);
        User u4 = new User("Beata4", "Testowa4", "beata4@test.pl", 44);
        User u5 = new User("Beata4", "Testowa4", "beata4@test.pl", 44);
        // System.out.println(User.userCounter); // do pola statycznego dostajemy się za pomocą klasy a nie obiektu
        System.out.println(User.getUserCounter());

        StringUtils stringUtils = new StringUtils();

        String bartekTest = stringUtils.getFormattedText("BartekTest");
        System.out.println(bartekTest);

        String bartek = stringUtils.getFormattedText("Bartek");
        System.out.println(bartek);

        System.out.println(WeekUtils.MONDAY);

        System.out.println(u4);
        System.out.println(u4.equals(u5));

    }
}

