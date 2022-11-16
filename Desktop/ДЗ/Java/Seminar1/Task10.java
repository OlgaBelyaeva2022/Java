//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) 
//заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
//Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
//то есть [0][0], [1][1], [2][2], …, [n][n]

package Seminar1;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        int array[][] = {{3, 8, 9}, {2, 6, 10}, {4, 9, 4}};
        method(array);
        System.out.println(Arrays.deepToString(array));    
    }
    private static void method(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i][j];
                }
            }
        }
    }
}