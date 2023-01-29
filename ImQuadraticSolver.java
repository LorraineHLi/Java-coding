public class ImQuadraticSolver {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double delta = (b*b) - 4*a*c;
        if (a == 0) {
            System.out.println((-c) / b);
        }else {
            if (delta < 0) {
                double coeff = Math.sqrt(Math.abs(delta))/2*a;
                System.out.println((-b)/2*a + " + " + coeff + "i");
                System.out.println((-b)/2*a + " - " + coeff + "i");
            }else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a) ;
                double x2 = (-b - Math.sqrt(delta)) / (2*a) ;
                System.out.println(x1);
                System.out.println(x2);
            }
        }
    }
}
