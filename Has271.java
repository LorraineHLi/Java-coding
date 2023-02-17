public class Has271 {
    public static boolean has271(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i] == (nums[i-1] + 5)) && (nums[i+1] == (nums[i-1]) - 1)) {
                return true;
            }
        }
        return false;
    }
}
