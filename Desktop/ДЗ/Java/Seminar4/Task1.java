//Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// Stack [a, b, c, d] LIFO Last In First Out

package Seminar4;

import java.util.LinkedList;

public class Task1 {
    
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>(); // stack
        stack.add(5);
        stack.add(7);
        stack.add(51);
        stack.add(8);
        stack.add(13);
        stack.add(4);
        System.out.println(stack);
        stack.addFirst(1);
        System.out.println(stack);
        Integer last = stack.getLast();
        System.out.println(last);
        stack.remove(3);
        System.out.println(stack);
        stack.remove();
        System.out.println(stack);
        stack.remove();
        System.out.println(stack);
    }
    
}
