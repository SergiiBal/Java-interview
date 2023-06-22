package lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3);
        System.out.println(integerList);
        //will fail because collection is immutable
        //integerList.add(1);

        //backed by Array, has fixed size, but re-sized every time threshold is reached. Fast access by index
        ArrayList<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(2);
        System.out.println(integersList);
        System.out.println(integersList.get(1));


        //linked elements
        LinkedList<Integer> linkedIntegersList = new LinkedList<>();
        linkedIntegersList.add(1);
        linkedIntegersList.add(2);
        System.out.println(linkedIntegersList);
        System.out.println(linkedIntegersList.get(1));
    }
}
