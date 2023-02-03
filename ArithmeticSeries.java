public class ArithmeticSeries {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        int index = 1;
        while (index <= n) {
            sum += index;
            index ++;
        }
        System.out.println(sum);
    }
}
