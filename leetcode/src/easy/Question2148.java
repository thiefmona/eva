package easy;

import java.util.Arrays;

public class Question2148 {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int c1 = 1;
        int c2 = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                c1++;
            }else{
                break;
            }
        }

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] == nums[i - 1]) {
                c2++;
            }else {
                break;
            }
        }
        if (c1 + c2 >= nums.length) {
            return 0;
        } else {
            return nums.length - c1 - c2;
        }

    }

    public static void main(String[] args) {
        System.out.println(new Question2148().countElements(new int[]{-3,3,3,90}));
    }
}
