//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
//каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
//необходимо как-то оповестить пользователя. Вместо массива может прийти null (обработать)

package Seminar1;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] nums1 = { 5, 7, 1 };
        int[] nums2 = { 4, 2, 0 };

        System.out.println(Arrays.toString(differenceOf(nums1, nums2)));
    }

    private static int[] differenceOf(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (nums1.length != nums2.length) {
            throw new RuntimeException("Длина массивов должна быть равна!");
        }

        int[] resultnums = new int[nums1.length];
        for (int i = 0; i < resultnums.length; i++) {
            resultnums[i] = nums1[i] - nums2[i];
        }
        return resultnums;
    }
}
