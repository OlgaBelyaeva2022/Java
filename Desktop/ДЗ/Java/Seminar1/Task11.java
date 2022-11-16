//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, 
//каждая ячейка которого равна initialValue.

package Seminar1;

public class Task11 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        printArray(method(5, 6));
    }
    private static int[] method(int len, int initialvalue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialvalue;
        }
    return array;   
    }
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
           System.out.print(array[i] + " "); 
        }
    }
}
