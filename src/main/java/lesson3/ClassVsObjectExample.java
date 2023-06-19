package lesson3;

import java.util.Objects;

public class ClassVsObjectExample {
    public static void main(String[] args) {
        ClassVsObjectExample classVsObjectExample1 = new ClassVsObjectExample();
        ClassVsObjectExample classVsObjectExample2 = new ClassVsObjectExample();

        //true or false?
        System.out.println(classVsObjectExample1.equals(classVsObjectExample2));

        Phone ostapPhone = new Phone("Samsung");
        Phone tarasPhone = new Phone();
        //I want it to be true!
        System.out.println(ostapPhone.equals(tarasPhone));
        SuperPhone sergiiPhone = new SuperPhone();
        //this is false, because Sergii's samsung is a lesson3.SuperPhone
        System.out.println(ostapPhone.equals(sergiiPhone));

        //would throw exception, try it
        //new lesson3.Phone("");
    }
}

class Phone {
    private final String model;

    //each class by default has () constructor. But be can define our own, if we want it.
    public Phone() {
        model = "Samsung";
    }

    public Phone(String model) {
        if (model.isEmpty()) {
            throw new RuntimeException("lesson3.Phone should have name!!!");
        }
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //to compare if classes are same
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }
}

class SuperPhone extends Phone {

}