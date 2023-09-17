package interview;

import java.util.HashMap;
import java.util.Map;

public class Interview0104 {
    public boolean canPermutePalindrome(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}