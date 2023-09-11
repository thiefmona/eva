package easy;

public class Question0027 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        int k = nums.length;
        while (j < k) {
            if (nums[j] != val) {
                j++;
            } else {
                nums[j] = nums[k - 1];
                k--;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
