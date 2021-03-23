import enums.WeekDays;

public class MainEnums {
    public static void main(String[] args) {
        // ENUM - TYPY WYLICZENIOWE

        System.out.println(WeekDays.SRODA.getName());

        if("środa".equalsIgnoreCase(WeekDays.SRODA.getName())) {
            System.out.println("JEST OK");
        } else {
            System.out.println("NIE JEST OK");
        }
    }
}
