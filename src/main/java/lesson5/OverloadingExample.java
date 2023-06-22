package lesson5;

public class OverloadingExample {

    public static void animalPlaying() {
        //System.out.println("Animal is playing");
        animalPlaying("Animal");
    }

    public static void animalPlaying(String name) {
        System.out.println(name + " is playing");
    }

    public static void main(String[] args) {
        animalPlaying();
        animalPlaying("Koza");

        //same example of reusing
        System.out.println("Koza".substring(1, 4));
        System.out.println("Koza".substring(1));
    }
}
