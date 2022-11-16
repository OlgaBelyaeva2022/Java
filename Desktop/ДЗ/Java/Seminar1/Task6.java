//Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). 
//Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный

package Seminar1;

public class Task6 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.println(method(1900)); 
    }
    private static boolean method(int year) {
        if (year%4==0 && year%100 !=0 || year%400==0) {
            return true;
        } else {
            return false;
        }
    }
}
