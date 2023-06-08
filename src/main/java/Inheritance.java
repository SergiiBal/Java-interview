public class Inheritance {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.printMethod();
    }
}

class SuperClass {
    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

class SubClass extends SuperClass {
    //inherits the methods from SuperClass
}