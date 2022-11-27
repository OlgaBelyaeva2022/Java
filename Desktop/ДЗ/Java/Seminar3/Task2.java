//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 5, 6, 11, 3, 22, 15, 7, 8);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list)); 
        
        Integer sum = 0;
        for (int i: list) {
            sum += i;
        }
        double average = (double) sum / list.size();
        System.out.println(average);
     }
     
 }
 