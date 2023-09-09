package leetcodeEasy;

public class Question0026 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int p = j + 1;
        for (; p < nums.length; ) {
            if (nums[j] == nums[p]) {
                p++;
            } else {
                j++;
                nums[j] = nums[p];
                p++;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
