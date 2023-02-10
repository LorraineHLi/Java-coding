public class ArrayOps {
    public static double findMax(double[] data) {
        double max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }

    public static double[] normalise(double data[]) {
        int l = data.length;
        double newA[] = new double[l];
        double sum = 0;
        for (int i = 0; i < l; i++) {
            sum += data[i];
        }
        for (int j = 0; j < l; j++) {
            newA[j] = data[j] / sum;
        }
        return newA;
    }

    public static void normaliseInPlace(double data[]) {
        int l = data.length;
        double sum = 0;
        for (int i = 0; i < l; i++) {
            sum += data[i];
        }
        for (int j = 0; j < l; j++) {
            data[j] = data[j] / sum;
        }
    }

    public static double[] reverse(double[] data) {
        int l = data.length;
        double newA[] = new double[l];
        for (int i = 0; i < l; i++) {
            newA[i] = data[(l-1) - i];
        }
        return newA;
    }

    public static void reverseInPlace(double[] data) {
        swap(data, reverse(data));
    }

    public static void swap(double[] data1, double[] data2) {
        int l = data1.length;
        double temp[] = new double[l];
        for (int i = 0; i < l; i++) {
            temp[i] = data1[i];
            data1[i] = data2[i];
            data2[i] = temp[i];
        }
    }
}
