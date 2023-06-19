package lesson4;

public interface InterfaceExample {

    //public static final by default for variables in the interface
    public static final String VARIABLE_ONE = "";

    //public by default for methods
    public void doWork();

}

interface AnotherInterface {

    void doAnotherWork();
}

//class can extend only 1 another class, but can implement multiple interfaces
class Worker implements InterfaceExample, AnotherInterface {

    @Override
    public void doWork() {
        System.out.println("Doing Work");
    }

    @Override
    public void doAnotherWork() {
        System.out.println("Doing another work");
    }
}

class Main {

    public static void main(String[] args) {
        processWork(new Worker());
        InterfaceExample anonymousInstance = new InterfaceExample() {
            @Override
            public void doWork() {
                System.out.println("Different Work");
            }
        };
        processWork(anonymousInstance);
        processWork(() -> System.out.println("Yet another work"));
    }

    public static void processWork(InterfaceExample interfaceExample) {
        interfaceExample.doWork();
    }
}