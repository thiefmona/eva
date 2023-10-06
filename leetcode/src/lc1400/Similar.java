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

    /**
     * 1064
     *
     * @param arr
     * @return
     */
    public int fixedPoint(int[] arr) {
        // 升序数组 最大值为负数直接过滤
        if (arr[arr.length - 1] < 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public int[][] highFive(int[][] items) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int[] item : items) {
            List<Integer> list = map.getOrDefault(item[0], new ArrayList<>());
            list.add(item[1]);
            map.put(item[0], list);
        }

        int[][] ans = new int[map.size()][2];
        final int[] i = {0};
        map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).forEach(entry -> {
            Integer key = entry.getKey();
            List<Integer> value = entry.getValue();
            value.sort((o1, o2) -> o2 - o1);
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += value.get(j);
            }
            ans[i[0]][0] = key;
            ans[i[0]++][1] = sum / 5;
        });

        return ans;
    }

    public int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences).map(str -> str.split(" ").length).max(Comparator.comparingInt(Integer::intValue)).get();
    }

    /**
     * 2644
     *
     * @param nums
     * @param divisors
     * @return
     */
    public int maxDivScore(int[] nums, int[] divisors) {
        int ans = divisors[0], maxCount = 0;

        for (int i = 0; i < divisors.length; i++) {
            int count = 0;
            for (int num : nums) {
                count += num % divisors[i] == 0 ? 1 : 0;
            }
            if (count > maxCount || count == maxCount && divisors[i] < ans) {
                maxCount = count;
                ans = divisors[i];
            }
        }
        return ans;
    }

    /**
     * 2363
     *
     * @param items1
     * @param items2
     * @return
     */
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] ints : items1) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }
        for (int[] ints : items2) {
            map.put(ints[0], map.getOrDefault(ints[0], 0) + ints[1]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        map.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getKey)).forEach(entry -> {
            ans.add(Arrays.asList(entry.getKey(), entry.getValue()));
        });

//        var m = new HashMap<Integer, Integer>();
//        for (var p : items1) m.merge(p[0], p[1], Integer::sum);
//        for (var p : items2) m.merge(p[0], p[1], Integer::sum);
//        var ans = new ArrayList<List<Integer>>();
//        for (var e : m.entrySet())
//            ans.add(List.of(e.getKey(), e.getValue()));
//        ans.sort((a, b) -> (a.get(0) - b.get(0)));
        return ans;


    }


    public static void main(String[] args) {
        System.out.println(new Similar().maxDivScore(new int[]{4, 7, 9, 3, 9}, new int[]{5, 2, 3}));
    }
}
