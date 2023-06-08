import java.util.Objects;

public class ClassVsObjectExample {
    public static void main(String[] args) {
        ClassVsObjectExample classVsObjectExample1 = new ClassVsObjectExample();
        ClassVsObjectExample classVsObjectExample2 = new ClassVsObjectExample();

        //true or false?
        System.out.println(classVsObjectExample1.equals(classVsObjectExample2));

        Phone ostapPhone = new Phone();
        ostapPhone.model = "Samsung";
        Phone tarasPhone = new Phone();
        tarasPhone.model = "Samsung";
        //I want it to be true!
        System.out.println(ostapPhone.equals(tarasPhone));
        SuperPhone sergiiPhone = new SuperPhone();
        tarasPhone.model = "Samsung";
        //this is false, because Sergii's samsung is a SuperPhone
        System.out.println(ostapPhone.equals(sergiiPhone));
    }
}

class Phone {
    String model;

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