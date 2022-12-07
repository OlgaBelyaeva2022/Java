//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//"Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем HHD или SSD
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Seminar6;

//import java.util.List;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Laptop> laptops = new HashSet<>();
        //List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(0, "Asus", 16, 250, "Windows10", 14));
        laptops.add(new Laptop(1, "Asus", 32, 250, "Windows11", 14));
        laptops.add(new Laptop(2, "Lenovo", 16, 500, "Windows11", 15));
        laptops.add(new Laptop(3, "Xiaomi", 32, 1000, "Windows11", 15));
        laptops.add(new Laptop(4, "Acer", 64, 750, "Windows11", 16));
        laptops.add(new Laptop(5, "Lenovo", 64, 750, "Windows11", 15));

        Filter(userRequest(), laptops);
        // System.out.println(dog.toString());
        //System.out.println(laptops);
    }

    public static HashMap<String, String> userRequest() {
        HashMap<String, String> userRequest = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметры для поиска. Параметры, которые не участвуют в поиске, оставьте пустыми: ");
        System.out.print("Введите тип ОС:");
        userRequest.put("os", scanner.nextLine());
        System.out.print("Введите производителя:");
        userRequest.put("brand", scanner.nextLine());
        System.out.print("Введите минимальный объем жесткого диска:");
        userRequest.put("sdd_volume", scanner.nextLine());
        System.out.print("Введите минимальный объем оперативной памяти:");
        userRequest.put("ram_volume", scanner.nextLine());
        System.out.print("Введите минимальную диагональ дисплея:");
        userRequest.put("display_size", scanner.nextLine());
        scanner.close();
        return userRequest;

    }
    public static void Filter(HashMap<String, String> userRequest, HashSet<Laptop> catalog) {
        Boolean noResultsFlag=true;
        for (Laptop lt : catalog) {
            if (userRequest.get("brand").equals(lt.getBrand()) || userRequest.get("brand") == "") {
                if (userRequest.get("os").equals(lt.getOS()) || userRequest.get("os") == "") {
                    if (lt.getDispsize() >= Integer.parseInt(userRequest.get("display_size")) &&
                     (lt.getSDDvolume() >= Integer.parseInt(userRequest.get("sdd_volume"))) && 
                     (lt.getRAMvolume() >= Integer.parseInt(userRequest.get("ram_volume")))) {
                            System.out.println(lt);
                            noResultsFlag=false;
                    }
                }
            }
        }
           
        if (noResultsFlag){
            System.out.println("По вашему запросу ничего не найдено.");
        }
    }
}
