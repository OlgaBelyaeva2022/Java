//Если необходимо, исправьте данный код 
//(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

package Seminar2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = { 1, 3, 4, 5, 6, 7, 8, 1, 8 };
        int d = 0;
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("Nulls are not allowed: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound: " + e);
        }
    }
}
