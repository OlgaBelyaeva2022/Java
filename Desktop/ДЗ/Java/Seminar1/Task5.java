//Написать метод, которому в качестве аргументов передается строка и число, 
//метод должен отпечатать в консоль указанную строку, указанное количество раз

package Seminar1;

public class Task5 {
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        System.out.println(method(5, "Пока земля еще вертится... ")); 
    }
    private static String method(int n, String str) {
        //str = "Пока Земля еще вертится...";
        //n = 5;
        String result = "";
        for (int i = 1; i <= n; i++) {
            result += str;
        }
        return result;
    }
}
