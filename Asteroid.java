public class Asteroid {
    double distance;
    double theta;
    double phi;
    int speed;
    SizeCategory size;

    public Asteroid(double distance, double theta, double phi, int speed, SizeCategory size) {
        this.distance = distance;
        this.theta = theta;
        this.phi = phi;
        this.speed = speed;
        if (size == null) throw new NullPointerException();
        else this.size = size;
    }

    public double getDistance() {
        return distance;
    }

    public double getTheta() {
        return theta;
    }

    public double getPhi() {
        return phi;
    }

    public int getSpeed() {
        return speed;
    }

    public SizeCategory getSize() {
        return size;
    }

    @Override
    public boolean equals(Object a) {
        if (a == this) return true;
        else if (a instanceof Asteroid) {
            Asteroid ast = (Asteroid) a;
            if (Double.compare(getDistance(), ast.getDistance()) == 0) {
                if (Double.compare(getTheta(), ast.getTheta()) == 0) {
                    if (Double.compare(getPhi(), ast.getPhi()) == 0) {
                        if (getSpeed() == ast.getSpeed()) {
                            return getSize().equals(ast.getSize());
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) distance;
        hash = 23 * hash + (int) theta;
        hash = 23 * hash + (int) phi;
        hash = 23 * hash + speed;
        hash = 23 * hash + size.hashCode();
        return hash;
    }
}