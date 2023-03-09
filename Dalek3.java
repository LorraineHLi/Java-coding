import java.util.ArrayList;
import java.util.Arrays;

public class Dalek3 {
    private static ArrayList<String> sayings = new ArrayList<String>();
    public static ArrayList<String> setSayings(String[] utt) {
        sayings.addAll(Arrays.asList(utt));
        return sayings;
    }
    public static void speak() {
        if (sayings.size() > 0) {
            int i = (int) (Math.random() * (sayings.size()));
            System.out.println(sayings.get(i));
        }
        else System.out.println("No utterances installed!");
    }
    public static void addSaying(String s) {
        sayings.add(s);
    }

    public static void main(String[] args) {
        Dalek3 d1 = new Dalek3();
        String[] u1 = { "Exterminate, Exterminate!", "I obey!",
                "Exterminate, annihilate, DESTROY!", "You cannot escape.",
                "Daleks do not feel fear.", "The Daleks must survive!" };
        d1.setSayings(u1);

        System.out.println("\nDalek d1 says: ");
        for (int i = 0; i < 10; i++) {
            d1.speak();
        }

        System.out.println("\nDalek d2 says: ");
        Dalek3 d2 = new Dalek3();
        String[] u2 = { "I obey!" };
        d2.setSayings(u2);

        for (int i = 0; i < 10; i++) {
            d2.speak();
        }
    }
}
