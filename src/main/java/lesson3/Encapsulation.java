package lesson3;

public class Encapsulation {

    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        //field is not accessed directly
        //encapsulationExample.data;

        encapsulationExample.setData(10);
        System.out.println(encapsulationExample.getData());
    }
}

class EncapsulationExample {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
