//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь 
//может увидеть - RuntimeException, т.е. ваше.

package Seminar1;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] nums1 = { 25, 8, 1 };
        int[] nums2 = { 5, 2, 1 };

        System.out.println(Arrays.toString(divideOf(nums1, nums2)));
    }

    private static int[] divideOf(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (nums1.length != nums2.length) {
            throw new RuntimeException("Длина массивов должна быть равна!");
        }

        int[] resultnums = new int[nums1.length];
        for (int i = 0; i < resultnums.length; i++) {
            if (nums2[i] == 0) {
                throw new RuntimeException("Деление на ноль!");
            }
            resultnums[i] = nums1[i] / nums2[i];
        }
        return resultnums;
    }
}
