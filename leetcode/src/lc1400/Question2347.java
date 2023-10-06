package lc1400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Question2347 {
    public int minimumOperations(int[] nums) {
        // 等价于不同的正整数的个数
        return Arrays.stream(nums).filter(num -> num > 0).boxed().collect(Collectors.toSet()).size();
    }
}
