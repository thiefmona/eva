package lc1400;

import java.util.*;
import java.util.stream.Collectors;

public class Similar {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        int count = 0;
        int i = 0;
        int len = nums.length;
        while (i < len) {
            while (i < len && nums[i] % 2 != 0) {
                i++;
            }
            if (i == len) {
                return ans;
            }
            int left = i;
            i++;
            while (i < len && nums[i] == nums[i - 1]) {
                i++;
            }
            int right = i;
            if (right - left > count) {
                count = right - left;
                ans = nums[left];
            }
        }
        return ans;
    }

    /**
     * 2160
     *
     * @param num
     * @return
     */
    public int minimumSum(int num) {
        // 数字拆分为数组
        int[] arr = new int[4];
        int count = 0;
        while (num > 0) {
            arr[count++] = num % 10;
            num /= 10;
        }
        // 数组排序
        Arrays.sort(arr);
        // 最小值为 12 +04
        return arr[1] * 10 + arr[2] + arr[0] * 10 + arr[3];
    }

    /**
     * 2348   1+n * n /2
     *
     * @param nums
     * @return
     */
    public long zeroFilledSubarray(int[] nums) {
        // 分段
        int i = 0, len = nums.length;
        long ans = 0;
        while (i < len) {
            while (i < len && nums[i] != 0) {
                i++;
            }
            if (i == len) {
                return ans;
            }
            int left = i;
            i++;
            while (i < len && nums[i] == nums[i - 1]) {
                i++;
            }
            int right = i;
            ans += (long) (right - left + 1) * (right - left) / 2;

        }
        return ans;
    }

    /**
     * 2225
     *
     * @param matches
     * @return
     */
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // 建立映射表 赢者输的次数+0 输的人次数+1
        for (int[] match : matches) {
            map.put(match[0], map.getOrDefault(match[0], 0));
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        List<Integer> list0 = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        // 遍历Hash表
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                list0.add(entry.getKey());
            }
            if (entry.getValue() == 1) {
                list1.add(entry.getKey());
            }
        }

        list0.sort(Comparator.comparing(Integer::intValue));
        list1.sort(Comparator.comparing(Integer::intValue));
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list0);
        ans.add(list1);
        return ans;
    }

    /**
     * 2085
     *
     * @param words1
     * @param words2
     * @return
     */
    public int countWords(String[] words1, String[] words2) {
        // 练习一下stream流
        Set<String> set1 = Arrays.stream(words1).collect(Collectors.groupingBy(Objects::toString, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toSet());

        set1.retainAll(Arrays.stream(words2).collect(Collectors.groupingBy(Objects::toString, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toSet()));
        return set1.size();
    }


    public static void main(String[] args) {
        System.out.println(new Similar().mostFrequentEven(new int[]{29, 47, 21, 41, 13, 37, 25, 7}));
    }
}
