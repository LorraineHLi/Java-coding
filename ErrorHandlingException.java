import java.util.*;

public class ErrorHandlingException {
    public static String lowerAndTrim(String s) {
        s = (s.toLowerCase()).strip();
        return s;
    }

    public static void formatText(String[] strs) {
        int counter = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) System.out.println(lowerAndTrim(strs[i]));
            else counter += 1;
        }
        System.out.println(counter);
    }
}
