package lesson7;

import java.util.*;

public class ListToMap {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Jane", 30),
                new Person("Alice", 25),
                new Person("Bob", 30)
        );

        Map<Integer, List<Person>> groupedMap = groupListByKey(people, Person::getAge);

        for (Map.Entry<Integer, List<Person>> entry : groupedMap.entrySet()) {
            int age = entry.getKey();
            List<Person> peopleWithSameAge = entry.getValue();

            System.out.println("Age: " + age);
            for (Person person : peopleWithSameAge) {
                System.out.println(person.getName());
            }
            System.out.println();
        }
    }

    public static <T, K> Map<K, List<T>> groupListByKey(List<T> list, KeyExtractor<T, K> keyExtractor) {
        Map<K, List<T>> groupedMap = new HashMap<>();

        for (T element : list) {
            K key = keyExtractor.extractKey(element);
            groupedMap.computeIfAbsent(key, k -> new ArrayList<>()).add(element);
        }

        return groupedMap;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

interface KeyExtractor<T, K> {
    K extractKey(T element);
}