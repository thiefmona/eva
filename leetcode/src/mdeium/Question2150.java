package mdeium;

import java.util.*;

public class Question2150 {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            Integer value = map.getOrDefault(num, 0);
            map.put(num, value + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1 && !map.containsKey(key - 1) && !map.containsKey(key + 1)) {
                result.add(key);
            }
        }

        return result;
    }
}
