public class NoTriples {
    public static boolean noTriples(int[] nums) {
        int curr = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == curr) {
                count += 1;
                if (count == 3) return false;
            }
            else {
                curr = nums[i];
                count = 1;
            }
        }
        return true;
    }
}
