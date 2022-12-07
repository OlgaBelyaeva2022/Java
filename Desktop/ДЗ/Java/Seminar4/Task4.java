//Реализовать консольное приложение, которое принимает от пользователя строку вида text~num.
//Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
//Если ввод не содержит символа ~, то завершает программу с ошибкой.
//Если введено -1, то выходим
// string~3
// java~5
// print~0 => ""
// print~3 => string

package Seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        List<String> storage = new LinkedList<>(); // []
        while (true) {
            String command = sc.next();
            
            String[] args = command.split("~"); // string~4
            if (args.length != 2) {
                throw new IllegalArgumentException();
            }
        
            String string = args[0];
            String num = args[1];
            int number = Integer.parseInt(num);
                
            int size = storage.size();
            
            if (size < number) {
                int left = number - size;
                for (int i = left; i >= 0; i--) {
                    storage.add("null");
                }
            }
            
            storage.set(number, string);           
            System.out.println(storage);  
            if(Objects.equals(args[0], "print") && args[1] == num) {
            //if (command.contains(args[0]=="print")  && args[1] == num){

                System.out.println(args[0]);
                storage.remove(args[0]);
                System.out.println(storage);
            }
                
        }
          
    }   
            
}
    
       