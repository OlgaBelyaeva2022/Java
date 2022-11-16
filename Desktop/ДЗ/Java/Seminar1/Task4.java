//Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, 
//если число отрицательное, и вернуть false если положительное.

package Seminar1;

public class Task4 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.println(method(-5)); 
    }
    private static boolean method(int value) {
        return value > 0;
    }
}
