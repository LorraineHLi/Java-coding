import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TempMedian {
    public static void main(String[] args) {
        int n = args.length;
        int[] num = new int[n];
        int temp = Integer.parseInt(args[0]);
        num[0] = temp;
        for (int i = 1; i < n; i++) {
            if (args[i].equals("+")) temp += 1;
            if (args[i].equals("-")) temp -= 1;
            num[i] = temp;
        }
        for (int out = 0; out < n; out++) System.out.print(num[out] + " ");
        System.out.println();
        Arrays.sort(num);
        for (int out = 0; out < n; out++) System.out.print(num[out] + " ");
        System.out.println();

        if (n % 2 == 1) {
            double median = num[n/2];
            System.out.println(median);
        }else {
            double p1 = num[n/2 - 1];
            double p2 = num[n/2];
            double median = (p1 + p2) / 2;
            System.out.println(median);
        }
    }
}
