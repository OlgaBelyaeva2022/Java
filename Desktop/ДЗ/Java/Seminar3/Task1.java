//Пусть дан произвольный список целых чисел, удалить из него четные числа.

package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       Collections.addAll(list, 1, 5, 6, 11, 3, 22, 15, 7, 8);
       System.out.println(list);
       ArrayList<Integer> oddList = new ArrayList<>();


       for (int i = 0; i < list.size(); i++) {
        Integer x = list.get(i);    
            if (x % 2 != 0) {
                oddList.add(x);
            } 
        }
        System.out.println(oddList);  
    }
    
}
