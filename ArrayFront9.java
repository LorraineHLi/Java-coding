public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        int arrayLength = nums.length;
        boolean ifIncluded = false;
        if (arrayLength > 4) {
            for (int i = 0; i < 4; i++) {
                if (nums[i] == 9) ifIncluded = true;
            }
        }
        else {
            for (int j = 0; j < arrayLength; j++) {
                if (nums[j] == 9) ifIncluded = true;
            }
        }
        return ifIncluded;
    }

    public static void main(String[] args) {
        int argLength = args.length;
        int[] nums = new int[argLength];
        for (int i = 0; i < argLength; i++) nums[i] = Integer.parseInt(args[i]);
        System.out.println(arrayFront9(nums));
    }
}
