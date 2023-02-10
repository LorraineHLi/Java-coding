public class CoordinateConverter {
    public static double convertXYtoR(double x, double y) {
        double r = Math.sqrt(x*x + y*y);
        return r;
    }

    public static double convertXYtoT(double x, double y) {
        double theta = Math.atan2(y, x);
        return theta;
    }

    public static double convertRTtoX(double r, double theta) {
        double x = r * Math.cos(theta);
        return x;
    }

    public static double convertRTtoY(double r, double theta) {
        double y = r * Math.sin(theta);
        return y;
    }

    public static double convertDegToRad(double deg) {
        double rad = Math.PI * (deg / 180);
        return rad;
    }

    public static double convertRadToDeg(double rad) {
        double deg = (rad / Math.PI) * 180;
        return deg;
    }
}
