package lc1400;

import java.util.HashMap;
import java.util.Map;

public class Question2176 {
    public int countPairs(int[] nums, int k) {
        // 嵌套循环
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
