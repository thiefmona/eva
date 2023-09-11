package easy;

import java.util.Arrays;

public class Question0136 {
    public int singleNumber(int[] nums) {
        // Arrays.stream(nums).
//        int result = 0;
//        for (int n : nums) {
//            result = result ^ n;
//        }
//        return result;

        return Arrays.stream(nums).reduce(0,(a,b)->a^b);
    }

    public static void main(String[] args) {
        System.out.println(0 ^ 4);
    }
}
