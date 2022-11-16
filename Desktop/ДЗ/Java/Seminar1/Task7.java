// Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
// С помощью цикла и условия заменить 0 на 1, 1 на 0.

package Seminar1;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        int [] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(array));
        
    }
}
    
