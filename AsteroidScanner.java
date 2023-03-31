import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AsteroidScanner {
    public static Set deduplicate(List data) {
        int counter = 0;
        HashSet<Asteroid> all = new HashSet<>();
        for (Object element: data) {
            if (element instanceof Asteroid) {
                if (all.contains(element)) counter += 1;
                all.add((Asteroid) element);
            }
        }
        System.out.println(counter + " duplicate asteroids found.");
        return all;
    }

    public static void main(String[] args) {
        List data = new ArrayList<>();
        data.add(new Asteroid(-9684.59,270.82,-132.84,551,SizeCategory.MEDIUM));
        data.add(new Asteroid(15303.82,-138.47,166.58,-639,SizeCategory.LARGE));
        data.add(new Asteroid(1952.42,106.64,94.28,-173,SizeCategory.LARGE));
        data.add(new Asteroid(15303.82,-138.47,166.58,-639,SizeCategory.LARGE));
        data.add(new Asteroid(2732.31,273.07,358.68,-284,SizeCategory.LARGE));
        data.add(new Asteroid(-13568.4,272.63,-236.04,-669,SizeCategory.SMALL));
        data.add(new Asteroid(-9730.6,-14.46,233.29,371,SizeCategory.MEDIUM));
        data.add(new Asteroid(-4486.87,-77.56,-317.61,686,SizeCategory.LARGE));
        data.add(new Asteroid(-4486.87,-77.56,-317.61,686,SizeCategory.LARGE));
        data.add(new Asteroid(-7199.88,-247.91,275.97,-730,SizeCategory.SMALL));
        data.add(new Asteroid(2684.32,-164.67,97.95,998,SizeCategory.LARGE));
        data.add(new Asteroid( 9666.93,339.71,336.86,-959,SizeCategory.MEDIUM));
        data.add(new Asteroid(-9730.6,-14.46,233.29,371,SizeCategory.MEDIUM));
        deduplicate(data);
    }
}
