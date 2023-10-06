package lc1400;

import java.util.HashMap;
import java.util.Map;

public class Question1133 {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).max(Integer::compareTo).orElse(-1);
    }
}
