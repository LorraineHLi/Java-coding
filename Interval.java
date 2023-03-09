public class Interval {
    private double left;
    private double right;
    public Interval(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public boolean doesContain(double x) {
        if (left < right && x >= left && x <= right) return true;
        return false;
    }

    public boolean isEmpty() {
        return (left > right);
    }

    public boolean intersects(Interval b) {
        if (!b.isEmpty()) {
            if (doesContain(b.left) || doesContain(b.right)) return true;
        }
        return false;
    }

    public String toString() {
        String s;
        if (isEmpty()) s = "Interval: (EMPTY)";
        else s = "Interval: [" + left + ", " + right + "]";
        return s;
    }
}
