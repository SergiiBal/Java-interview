package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] digitize(long n) {
        List<Integer> answer = new ArrayList<Integer>();

        if (n == 0) answer.add(0);

        while (n > 0) {
            answer.add((int) (n % 10));
            n = n / 10;
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}



/*
import java.util.Arrays;
        import java.util.Collections;
public class Kata {
    public static void main(String[] args) {


    public static int[] digitize(long n) {
        String[] str = ("" + n).split("");
        Collections.reverse(Arrays.asList(str));
        return Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    }
}
}
*/
