package lesson5_and_6;

public class OverrideExample {

    public static void main(String[] args) {
        System.out.println("First Superclass");
        new SuperClass().printMethod();
        System.out.println("Now Subclass");
        new SubClass().printMethod();
    }
}

class SuperClass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class SubClass extends SuperClass {
    //inherits the methods from lesson4.SuperClass

    @Override
    public void printMethod() {
        super.printMethod();
        System.out.println("Also printed in SubClass");
    }
}
