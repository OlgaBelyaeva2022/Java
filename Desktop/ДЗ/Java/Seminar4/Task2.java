//Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
// Queue [a, b, c, d] FIFO First In First Out

package Seminar4;

import java.util.ArrayDeque;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(5);
        queue.add(9);
        queue.add(14);
        queue.add(3);
        System.out.println(queue);
        Integer poll = queue.poll(); 
        Integer peek = queue.peek(); 
        Integer remove = queue.remove(); 
        Integer remove2 = queue.remove();

        System.out.println(queue);

        System.out.println("Poll = " + poll);
        System.out.println("Peek = " + peek);
        System.out.println("Remove = " + remove);
        System.out.println("Remove = " + remove2);
    }
   
}
