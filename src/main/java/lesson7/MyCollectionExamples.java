package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyCollectionExamples {
    public static void listToSet(List<Integer> integers) {
        Set<Integer> newSet = Set.copyOf(integers);
        System.out.println(newSet);
    }

    public static void setToList(Set<Integer> integers) {
        List<Integer> newList = new ArrayList<>(integers);
        System.out.println(newList);
        List<Integer> newList1 = new ArrayList<>();
        newList1.addAll(integers);
        System.out.println(newList1);
        List<Integer> newList2 = new ArrayList<>(6);
        for (int i : integers) {
            newList2.add(i);
        }
        System.out.println(newList2);
    }

    public static void main(String[] args) {
        List<Integer> sourceList = List.of(0, 1, 2, 3, 4, 5, 5);
        Set<Integer> sourceSet = Set.of(0, 1, 2, 3, 4, 5);
        listToSet(sourceList);
        setToList(sourceSet);
    }

}