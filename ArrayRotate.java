import java.util.*;
public class ArrayRotate {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            nums.add(Integer.parseInt(args[i]));
        }
        for (int j = 0; j < args.length - 1; j++) {
            copy.add(nums.get(j + 1));
        }
        copy.add(nums.get(0));
        for (int k = 0; k < args.length; k++) {
            System.out.print(copy.get(k) + " ");
        }
        System.out.println();
    }
}
