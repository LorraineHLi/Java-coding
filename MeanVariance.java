import java.util.ArrayList;
import java.util.List;

public class MeanVariance {
    public static void main(String[] args) {
        List<Double> num = new ArrayList<>();
        int n = args.length;
        double sum = 0.0;
        double varSum = 0.0;
        for (int i = 0; i < n; i++) {
            double temp = Double.parseDouble(args[i]);
            num.add(temp);
            sum += temp;
        }
        double mean = sum / n;
        for (int j = 0; j < n; j++) {
            varSum += Math.pow(num.get(j) - mean, 2);
        }
        double variance = varSum / n;
        System.out.println(mean);
        System.out.println(variance);
    }
}
