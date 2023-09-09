package leetcodeEasy;

public class Question2239 {
    public int findClosestNumber(int[] nums) {
        int result = nums[0];
        for (int num : nums) {
            if (Math.abs(num) < Math.abs(result)) {
                result = num;
            } else if (Math.abs(num) == Math.abs(result)) {
                result =  Math.max(num, result);
            }
        }

        return result;
    }
}
