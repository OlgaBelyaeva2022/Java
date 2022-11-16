//Задать одномерный массив и найти в нем минимальный и максимальный элементы.

package Seminar1;

public class Task12 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        int [] array = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 29};
        int max = getMax(array);
        int min = getMin(array);
        System.out.println("Максимальный элемент массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);    
    }
    private static int getMin(int[] array) {
        int min = array[0];      
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            } 
        }
        return min;
    }
    private static int getMax(int[] array) {
        int max = array[0];      
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } 
        }
        return max;
    } 
}