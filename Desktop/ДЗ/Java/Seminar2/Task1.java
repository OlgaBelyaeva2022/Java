//Напишите метод, который принимает на вход строку (String) и определяет
// является ли строка палиндромом (возвращает boolean значение)

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdcba")); // true
        System.out.println(isPalindrome("a")); // true
        System.out.println(isPalindrome("ccccc")); // true
        System.out.println(isPalindrome("abcd")); // false
    }
    
    public static boolean isPalindrome(String source) {
        StringBuilder strName = new StringBuilder(source);
        strName.reverse();

        if (strName.toString().equals(source)) {
            return true;
        } else {
            return false;
        }
    }
}