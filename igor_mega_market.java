package final_homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class igor_mega_market {
    public static void main(String[] args) {
        
        Laptop laptop1 = new Laptop();
        laptop1.model = "Asus";
        laptop1.hd = 256;
        laptop1.ram = 256;
        laptop1.os = "windos10";

        Laptop laptop2 = new Laptop();
        laptop2.model = "Asus";
        laptop2.hd = 512;
        laptop2.ram = 256;
        laptop2.os = "windos11";

        Laptop laptop3 = new Laptop();
        laptop3.model = "Aser";
        laptop3.hd = 256;
        laptop3.ram = 128;
        laptop3.os = "windos10";

        Laptop laptop4 = new Laptop();
        laptop4.model = "Aser";
        laptop4.hd = 528;
        laptop4.ram = 512;
        laptop4.os = "windos10";

        Laptop laptop5 = new Laptop();
        laptop5.model = "Aple";
        laptop5.hd = 1056;
        laptop5.ram = 512;
        laptop5.os = "MacOS";

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);

        printSet(laptops);
        
        HashMap<String,String> chooseLaptop = new HashMap<>();
        
        addFilter(chooseLaptop);
       
        // System.out.println(chooseLaptop);

        resultSet(laptops, chooseLaptop);
        // System.out.println(chooseLaptop.get("1"));
        // System.out.println(laptop1.hd);

        printSet(resultSet(laptops, chooseLaptop));

    }

    static void printSet(Set<Laptop> laptops) {

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
    static void addFilter(HashMap<String,String> chooseLaptop){
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        System.out.println("Установите фильтр для поиска: 1 - HD, 2 - RAM, 0 - поиск");
        
        while (work) {
            String n = scanner.nextLine();
            if (n.equals("1")){
                chooseLaptop.put(n, scanner.nextLine());
            }
            else if (n.equals("2")){
                chooseLaptop.put(n, scanner.nextLine());
            }
            else if (n.equals("0")){
                work = false;
            }
        }
        }
    static Set<Laptop> resultSet(Set<Laptop> laptops,HashMap<String,String> chooseLaptop ){
        Set<Laptop> result = new HashSet<Laptop>();
        for (Laptop laptop : laptops) {
            if(chooseLaptop.containsKey("1")&&chooseLaptop.containsKey("2")){
                if(laptop.hd > Integer.parseInt(chooseLaptop.get("1"))&&laptop.ram > Integer.parseInt(chooseLaptop.get("2"))){
                result.add(laptop);
                
                }
            }
            else if(chooseLaptop.containsKey("1")){
                if(laptop.hd > Integer.parseInt(chooseLaptop.get("1"))){
                result.add(laptop);
                }
            }
            else if(chooseLaptop.containsKey("2")){
                if(laptop.ram > Integer.parseInt(chooseLaptop.get("2"))){
                result.add(laptop);
                }
            }
            
            
        }
        return result;
    }
}
