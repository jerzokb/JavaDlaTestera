public class Main3 {

    public static void main(String[] args) {

        int i = 10;
        String str1 = "Hello"; // jest też obiektem
        String str2 = "hello";

        System.out.println(str1.equals(str2)); // porownanie stringow
        System.out.println(str1.equalsIgnoreCase(str2)); // porownanie stringow

        String s = str2.toUpperCase();
        System.out.println(s);
        String s1 = str1.toLowerCase();
        System.out.println(s1);

        boolean startsWith = str1.startsWith("He");
        System.out.println(startsWith);
        boolean endsWith = str2.endsWith("lo");
        System.out.println(endsWith);
        boolean contains = str1.contains("ll");
        System.out.println(contains);

        System.out.println("   ".isBlank()); // sprawdza długość stringa ignorując spacje
        System.out.println(" ".isEmpty()); // sprawdza długość stringa wliczając w to spacje

        String replace = str1.replace("llo", "QWE");
        System.out.println(replace);
        String replaceAll = str1.replaceAll("l", "k");
        System.out.println(replaceAll);

        String substring = str1.substring(1, 4); // ostatni index nie jest brany pod uwagę
        System.out.println(substring);

        String textWithWhiteSpace = "   to jest text     ";
        System.out.println(textWithWhiteSpace.length());

        String strip = textWithWhiteSpace.strip();
        System.out.println(strip);
        System.out.println(strip.length());

    }
}
