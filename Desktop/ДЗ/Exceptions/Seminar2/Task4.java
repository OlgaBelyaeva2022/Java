//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя (try быть не должно).

package Seminar2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");
        System.out.print("Введите данные: ");
        String input = sc.nextLine();
        sc.close();
        if (input.isEmpty()) {
            sc.close();
            throw new RuntimeException("Вы ввели пустую строку!");
        }
        System.out.println("Вы ввели: " + input);
    }
}
