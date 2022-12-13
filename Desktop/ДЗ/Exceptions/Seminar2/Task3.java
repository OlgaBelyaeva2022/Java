//Дан следующий код, исправьте его там, где требуется 
//(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package Seminar2;

public class Task3 {
    public static void main(String[] args) {
        int a = 90;
        int b = 3;
        try {
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0");
        } catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

}
