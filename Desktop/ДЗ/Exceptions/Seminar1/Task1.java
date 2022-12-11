//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

package Seminar1;

public class Task1 {
    public static void main(String[] args) {
        division(15, 0);

        int[] array = new int[10];
        System.out.println(sumOfElements(array));

        int a = Integer.parseInt("5");
        int b = Integer.parseInt("25a");
        System.out.println(sumOfNumbers(a, b));
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int sumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int sumOfNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

}