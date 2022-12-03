//Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022.
// IV - 4
// VII - 7
// I = 1
// V = 5
// X = 10
// L = 50
// C = 100
// D = 500
// M = 1000

package Seminar5;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число в римском формате: ");
        String s = sc.nextLine();
		System.out.println(romanToInt(s));
        sc.close();
	}
    public static int romanToInt(String s) {
		HashMap<String,Integer> hashmap = new HashMap<>();
		hashmap.put("I",1);
		hashmap.put("IV",4);
		hashmap.put("V",5);
		hashmap.put("IX",9);
		hashmap.put("X",10);
		hashmap.put("XL",40);
		hashmap.put("L",50);
		hashmap.put("XC",90);
		hashmap.put("C",100);
		hashmap.put("CD",400);
		hashmap.put("D",500);
		hashmap.put("CM",900);
		hashmap.put("M",1000);
		int num = 0;
		for(int i=0;i<s.length();) {
			if(hashmap.containsKey(s.substring(i, i+1))) {
				if(i+2<=s.length()&&hashmap.containsKey(s.substring(i, i+2))) {
					num=num+hashmap.get(s.substring(i,i+2));
					i=i+2;
				}else {
					num=num+hashmap.get(s.substring(i,i+1));
					i++;
				}
			}
		}
		return num;
    }
}
