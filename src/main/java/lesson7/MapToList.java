package lesson7;

import com.sun.jdi.Value;

import java.util.*;

public class MapToList {


    public static void main(String[] args) {
        Map<String, String> enguaMonths = new HashMap<>();
        enguaMonths.put("January", "Січень");
        enguaMonths.put("February", "Лютий");
        enguaMonths.put("March", "Березень");
        enguaMonths.put("April", "Квітень");
        enguaMonths.put("May", "Травень");
        enguaMonths.put("June", "Червень");
        enguaMonths.put("July", "Липень");
        enguaMonths.put("August", "Серпень");
        enguaMonths.put("September", "Вересень");
        enguaMonths.put("October", "Жовтень");
        enguaMonths.put("November", "Листопад");
        enguaMonths.put("December", "Грудень");
        System.out.println(enguaMonths);
        //List <String> englishMonths = new ArrayList<>();
        List<String> listEnglish = new ArrayList<String>(enguaMonths.keySet());
        System.out.println(listEnglish);
        List<String> listUkrainian = new ArrayList<String>(enguaMonths.values());
        System.out.println(listUkrainian);
    }
}