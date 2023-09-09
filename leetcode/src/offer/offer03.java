package offer;

import java.util.HashSet;
import java.util.Set;

public class offer03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        throw new IllegalArgumentException("没有重复数字");
    }
}
