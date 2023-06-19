import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {
        String stringNumber = Long.toString(n);
        System.out.println(stringNumber);
     //   int[] arrayOfInt = {0,1,2,3};
        int [] arr = new int [stringNumber.length()];
        for(int i=stringNumber.length()-1; i>=0; i--) {
            arr[stringNumber.length()-i-1] = Integer.parseInt(stringNumber.substring(i, i + 1));
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }



    public static void main(String[] args) {
        Kata.digitize(435536);
        System.out.println("Hello");

    }
}
