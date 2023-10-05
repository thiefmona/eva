package lc1400;

import java.util.HashSet;
import java.util.Set;

public class Question2442 {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            int reverse = 0;
            while (num > 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            set.add(reverse);
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new Question2442().countDistinctIntegers(new int[]{1,13,10,12,31}));
    }
}
