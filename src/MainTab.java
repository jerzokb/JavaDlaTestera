public class MainTab {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 6, 3, 6, 7, 7, 9, 2, 4};

        // Zamień pierwszy element tablicy z ostatnim
        numbers[numbers.length - 1] = numbers[numbers.length-1] + numbers[0];
        numbers[0] = numbers[numbers.length-1] - numbers[0];
        numbers[numbers.length - 1] = numbers[numbers.length-1] - numbers[0];
        for (int number : numbers) {
            System.out.print(number + " , ");
        }

        // Zlicz liczby parzyste i nieparzyste
        int par = 0;
        int npar = 0;
        for (int number : numbers) {
            if(number%2 == 0) {
                par++;
            } else {
                npar++;
            }
        }
        System.out.println();
        System.out.println("Parzystych: " + par + ".");
        System.out.println("Nieparzystych: " + npar + ".");
        System.out.println();

        // Sortowanie rosnąco
        int min;
        for(int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " , ");
        }
        System.out.println();

        // Sortowanie malejąco 1
        int max;
        for(int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for(int j = i+1; j < numbers.length; j++) {
                if(numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " , ");
        }
        System.out.println();

        // Sortowanie malejąco 2
        int max1;
        for(int i = numbers.length-1; i > -1; i--) {
            max1 = numbers[i];
            for(int j = 0; j < i-1; j++) {
                if(numbers[j] < max1) {
                    max1 = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max1;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " , ");
        }
    }
}
