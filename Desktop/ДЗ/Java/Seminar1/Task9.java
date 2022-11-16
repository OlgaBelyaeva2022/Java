//Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2.

package Seminar1;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        method(array);
        System.out.println(Arrays.toString(array));    
    }
    private static void method(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            } else {
                array[i] = array[i];
            }
        }
    }
}