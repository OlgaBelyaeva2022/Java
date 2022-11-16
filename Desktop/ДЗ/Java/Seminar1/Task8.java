//Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100.

package Seminar1;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        int [] array = new int[100];
        method(array);
        System.out.println(Arrays.toString(array));    
    }
    private static void method(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
