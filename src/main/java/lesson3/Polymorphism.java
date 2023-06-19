package lesson3;

public class Polymorphism {
    public static void main(String[] args) {
        printShape(new Shape());
        printShape(new Square());
        printShape(new Circle());
    }

    //polymorphic calls resolved at runtime
    static void printShape(Shape shape) {
        shape.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("drawing square...");
    }
}
