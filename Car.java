public class Car implements Comparable<Car> {
    private int speed;
    private final int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (maxSpeed < 0) throw new IllegalArgumentException();
    }

    public int getSpeed() {
        return speed;
    }

    public void gas(int delta) {
        int speedAfter = speed + delta;
        if (speedAfter > maxSpeed) speed = maxSpeed;
        else if (speedAfter < 0) speed = 0;
        else speed += delta;
    }

    public int compareTo(Car that) {
        try {
            if (speed < that.speed) return -1;
            else if (speed == that.speed) return 0;
            return 1;
        }
        catch (NullPointerException e) {
            throw new NullPointerException();
        }
    }
}
