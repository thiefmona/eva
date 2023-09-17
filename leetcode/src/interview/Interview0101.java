package interview;

import java.util.HashSet;
import java.util.Set;

public class Interview0101 {
    public boolean isUnique(String astr) {
        char[] arr = astr.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : arr) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
