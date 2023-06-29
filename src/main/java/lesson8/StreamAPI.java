package lesson8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {
        //Stream API consists of transformations and reducing operation (Map-Reduce)

        List<Programmer> programmersList = List.of(
                new Programmer("Ostap", 32, 10),
                new Programmer("Sergii", 33, 1),
                new Programmer("Taras", 15, 2)
        );

        List<Programmer> sortedListOfProgrammersByAge = new ArrayList<>(programmersList);
        sortedListOfProgrammersByAge.sort(descendingByAgeComparator());
        System.out.println(sortedListOfProgrammersByAge);

        //If we call only transform operations (filter, map, peek, etc.) stream will not execute.
        // Stream is lazy and will execute only if you do reducing operation (reduce, collect, count, etc.)
        programmersList.stream()
                .peek(programmer -> System.out.println(programmer));

        List<String> newListOfProgrammers = programmersList.stream()
                //Consumer lambda
                .peek(programmer -> System.out.println(programmer))
                //Predicate Lambda
                .filter(programmer -> programmer.experienceInIT < 5)
                .peek(programmer -> System.out.println(programmer))
                .map(p -> p.name)
                //if lambda is simple with 1 parameter input uses simple method call,
                // then it can be replaced with Method Reference
                .map(String::toUpperCase)
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("Remaining programmers: " + newListOfProgrammers);

        //java.util.function has useful functions, such as Consumer, Predicate, Supplier, Function
        // that are very popular in Stream API and modern Java Programming.

        Map<Boolean, List<Programmer>> groupedProgrammers = programmersList.stream()
                .collect(Collectors.groupingBy(programmer -> programmer.experienceInIT > 5));
        System.out.println(groupedProgrammers);
    }

    private static Comparator<Programmer> descendingByAgeComparator() {
        return (o1, o2) -> o2.age - o1.age;
    }
}

class Programmer {
    String name;
    int age;
    int experienceInIT;

    public Programmer(String name, int age, int experienceInIT) {
        this.name = name;
        this.age = age;
        this.experienceInIT = experienceInIT;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experienceInIT=" + experienceInIT +
                '}';
    }
}
