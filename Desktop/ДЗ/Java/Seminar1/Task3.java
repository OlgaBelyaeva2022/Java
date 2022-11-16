// Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. 
// Замечание: ноль считаем положительным числом.

package Seminar1;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        method(-100);
    }
    private static void method(int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");            
        }
        
    }
}
