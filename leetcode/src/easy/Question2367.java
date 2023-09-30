package easy;

import java.util.HashMap;
import java.util.Map;

public class Question2367 {
    public int arithmeticTriplets(int[] nums, int diff) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            Integer i1 = map.get(nums[i] + diff);
            Integer i2 = map.get(nums[i] + diff + diff);
            if (i1 != null && i2 != null) {
                count++;
            }
        }
        return count;
    }
}
