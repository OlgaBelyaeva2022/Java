// Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), 
//если да – вернуть true, в противном случае – false.

package Seminar1;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.println(showResult(3,7));   
    }
    public static boolean showResult(int a, int b){
        return 10 <= a + b && a + b <= 20;
    }
    /* 
    private static int showResult(int value1, int value2) {
        int sum = value1 + value2;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    return sum;    
    }*/
}
