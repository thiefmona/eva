package lc1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Question2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // 创建两个set存储两个数组
        // boxed转换为包装类
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        // 通过set过滤
        return Arrays.asList(set1.stream().filter(o -> !set2.contains(o)).collect(Collectors.toList()),
                set2.stream().filter(o -> !set1.contains(o)).collect(Collectors.toList()));
    }
}
