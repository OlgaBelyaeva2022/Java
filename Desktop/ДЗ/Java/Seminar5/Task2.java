//Написать метод, который переведёт данное целое число в римский формат.

package Seminar5;

import java.util.Scanner;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число от 1 до 3999: ");
        Integer num = sc.nextInt();
		System.out.println(toRoman(num));
        sc.close();
    }
    public static String toRoman(Integer num) {
		TreeMap<Integer, String>  treemap = new TreeMap<Integer, String>();
		//TreeMap<Integer, String> map = new TreeMap<>();
		treemap.put(1,"I");
		treemap.put(4,"IV");
		treemap.put(5,"V");
		treemap.put(9,"IX");
		treemap.put(10,"X");
		treemap.put(40,"XL");
		treemap.put(50,"L");
		treemap.put(90,"XC");
		treemap.put(100,"C");
		treemap.put(400,"CD");
		treemap.put(500,"D");
		treemap.put(900,"CM");
		treemap.put(1000,"M");
		
		int l = treemap.floorKey(num);
		if (num == l) {
			return treemap.get(num);
		}
		return treemap.get(l) + toRoman(num - l);
    }
}
