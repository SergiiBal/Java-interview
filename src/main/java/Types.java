public class Types {
    static boolean yesOrNo;
    static byte byteNumber = Byte.MAX_VALUE;
    static short shortNumber = Short.MAX_VALUE;
    static int number = Integer.MAX_VALUE;
    static long longNumber = 7L;
    static double numberPointNumber = 7.7;
    static float floatNumber;
    static char aChar = 'C';
    static String aString = "name";
    public static void main(String[] args) {
        System.out.println(yesOrNo);
        System.out.println(byteNumber);
        byte summ = (byte) (byteNumber + 1);
        System.out.println(summ);
        int x = 5;
        int y = 0;
        if (x % 2 == 0) {
            System.out.println("The number is divisible by two.");
        } else if ((x > 5 && x < 10) || x == 100) {
            System.out.println("another");
        } else {
            System.out.println("The number is not divisible by two.");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }

}
