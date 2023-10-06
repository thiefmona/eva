package lc1400;

import java.util.HashMap;
import java.util.Map;

public class Question2206 {
    public boolean divideArray(int[] nums) {
        // 使用哈希表映射
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // 判断出现奇数次数的数字 不符合要求
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return false;
            }
        }
        return true;
    }
}
