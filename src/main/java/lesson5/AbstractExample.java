package lesson5;

public class AbstractExample {

    public static void main(String[] args) {
        checkSpeed(new Person());
        checkSpeed(new Turtle());
    }

    public static void checkSpeed(AbstractClass abstractClass) {
        abstractClass.walk();
    }
}

abstract class AbstractClass {

    abstract void walk();

    //many methods with implementation are not possible in interface, but possible in Abstract Class
    void doTheWalk() {
        walk();
    }

    void doTheWalk1() {
        walk();
    }
}

class Person extends AbstractClass {

    @Override
    void walk() {
        System.out.println("Walking 3km/h");
    }
}

class Turtle extends AbstractClass {

    @Override
    void walk() {
        System.out.println("Walking 0.01km/h");
    }
}

interface AnimalInterface {
    void walk();

    //since java 8 u can also do default methods in interface
    default void doWalk() {
        System.out.println("Blabla");
        walk();
    }
}