import java.util.Scanner;

public class NMax {
    public static int max(int a, int b, int c) {
        int lgst = a;
        if (b > lgst) lgst = b;
        if (c > lgst) lgst = c;
        return lgst;
    }

    public static double max(double a, double b, double c) {
        double lgst = a;
        if (b > lgst) lgst = b;
        if (c > lgst) lgst = c;
        return lgst;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        stdIn.close();
        System.out.println(max(a, b, c));
    }
}
