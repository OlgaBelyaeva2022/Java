// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

package Seminar1;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8"); 
            System.out.println(showTotalAmount(5));
            System.out.println(showMulti(5));   
    }
    private static int showTotalAmount(int value) {
        int sum = 0;
        for (int i = 1; i <= value; i++) {
           sum += i; 
        }  
    return sum;   
    }
    private static int showMulti(int value) {
        int multi = 1;
        for (int i = 1; i <= value; i++) {
            multi *= i; 
         }
    return multi;
    }
        
    }    

