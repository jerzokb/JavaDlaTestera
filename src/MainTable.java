public class MainTable {

    public static void main(String[] args) {

        // TABLICE [] - zbiór danych tego samego typu
        // Zawsze trzeba określić rozmiar rablicy
        // indexy zaczynaja się od zera
        // int[] numbers = new int[10]

        String[] names = new String[5];

        // ["Bartek", "Krystian", "Aneta", "Marek", "Rafał"]
        //    0          1           2        3        4

        names[0] = "Bartek";
        names[1] = "Krystian";
        names[2] = "Aneta";
        names[3] = "Marek";
        names[4] = "Rafał";

        // for(licznik; warunek; zmiana licznika)

        for(int i = 0; i < names.length; i++) {
            if(i%2 == 0) {
                System.out.println(names[i]);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }

        int[] numbers = new int[10];
        System.out.println("Dlugosc tablicy: " + numbers.length);

        String[] newNames = {"Bartek", "Krystian", "Ameta", "Marek"};

        for (String name : newNames) {
            System.out.println(name.toUpperCase());
        }

        // inkrementacja
        // number = number + 1;
        // number += 1;
        // number++ - zwiększanie wartości po użyciu zmiennej - postincrement
        // ++number - przed użyciem zmiennej - preincrement

        // Zamienić pierwszy element tablicy z ostatnim
        int[] newNumbers = {1, 2, 3, 4, 5};
        int first = newNumbers[0];
        newNumbers[0] = newNumbers[newNumbers.length-1];
        newNumbers[newNumbers.length-1] = first;
        for (int number : newNumbers) {
            System.out.println(number);
        }

        int[] ints = {1, 2, 3, 4, 5};
        ints[ints.length-1] = ints[ints.length-1] + ints[0];
        ints[0] = ints[ints.length-1] - ints[0];
        ints[ints.length-1] = ints[ints.length-1] - ints[0];

        int even = 0;
        int odd = 0;
        int[] calks = {2, 2, 3, 4, 5, 7, 7, 7, 8, 8, 2};
        for (int calk: calks) {
            if(calk%2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("liczb parzystych: " + even + " liczb nieparzystych: " + odd);

        int[] liczby = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
        // 0, 1, 2, 2, 4, 4, 5, 5, 8, 9
        int min;
        for (int i = 0; i < liczby.length; i++) {
            min = liczby[i];
            for(int j = i+1; j < liczby.length; j++) {
                if(liczby[j] < min) {
                    min = liczby[j];
                    liczby[j] = liczby[i];
                    liczby[i] = min;
                }
            }
        }
        for (int liczba : liczby) {
            System.out.println(liczba);
        }
    }
}
