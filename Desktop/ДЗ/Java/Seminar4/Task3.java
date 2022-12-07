//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Seminar4;

import java.util.LinkedList;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(5);
        integerLinkedList.add(9);
        integerLinkedList.add(4);
        integerLinkedList.add(7);
        System.out.println(integerLinkedList);
        System.out.println(reverse(integerLinkedList));
    }
    
    private static LinkedList<Integer> reverse(LinkedList<Integer> llist) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = llist.size()-1; i >= 0; i--) {
            reverseList.add(llist.get(i));
        }
        return reverseList;
      }
}
