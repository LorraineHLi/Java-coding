import java.util.ArrayList;
import java.util.List;

public class Mode {
    public static void main(String[] args) {
        List<Integer> dataset = new ArrayList<>();
        int n = args.length;
        for (int a = 0; a < n; a++) dataset.add(Integer.parseInt(args[a]));

        List<Integer> count = new ArrayList<>();
        for (int i = 0; i <= 9; i++) count.add(0);
        for (int j = 0; j < n; j++) count.set(dataset.get(j), count.get(dataset.get(j)) + 1);

        int max = 0;
        int maxIndex = 0;
        for (int k = 0; k < 10; k++) {
            System.out.print("[" + k + "s: " + count.get(k) + "]");
            if (count.get(k) != 0) {
                System.out.print(" ");
                for (int d = 0; d < count.get(k); d++) System.out.print(".");
            }
            System.out.println();
            if (count.get(k) > max) {
                max = count.get(k);
                maxIndex = k;
            }
        }
        System.out.println("Mode: " + maxIndex);
    }
}
