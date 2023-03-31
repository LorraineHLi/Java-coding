import java.util.Comparator;
import java.util.List;

public class CartComparator implements Comparator<ShoppingCart> {

    public int compare(ShoppingCart c1, ShoppingCart c2) {

        if (c1 == null && c2 == null) return 0;
        else if (c1 == null) return Integer.MAX_VALUE;
        else if (c2 == null) return Integer.MIN_VALUE;

        List<Double> p1 = c1.getItemPrices();
        List<Double> p2 = c2.getItemPrices();
        double sum1 = 0, sum2 = 0;
        double avg1, avg2;

        if (p1.size() == 0) avg1 = 0;
        else {
            for (Double price : p1) sum1 += price;
            avg1 = sum1 / p1.size();
        }

        if (p2.size() == 0) avg2 = 0;
        else {
            for (Double price : p2) sum2 += price;
            avg2 = sum2 / p2.size();
        }

        if (avg1 > avg2) return 1;
        else if (avg1 < avg2) return -1;
        return 0;
    }
}
