package lesson3;

public class StaticVsInstance {
    private static String staticValue = "Koza";
    private String instanceValue = "Koza";

    public static void main(String[] args) {
        StaticVsInstance object1 = new StaticVsInstance();
        object1.instanceValue = "Koza1";
        StaticVsInstance object2 = new StaticVsInstance();
        object2.instanceValue = "Koza2";
        StaticVsInstance.staticValue = "A";
        System.out.println(object1.instanceValue + ", " + StaticVsInstance.staticValue);
        System.out.println(object2.instanceValue + ", " + StaticVsInstance.staticValue);
    }
}
