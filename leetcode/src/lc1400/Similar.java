package lc1400;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    /**
     * 2177
     *
     * @param num
     * @return
     */
    public long[] sumOfThree(long num) {
        return num % 3 == 0 ? new long[]{num / 3 - 1, num / 3, num / 3 + 1} : new long[]{};
    }

    /**
     * 1037
     *
     * @param points
     * @return
     */
    public boolean isBoomerang(int[][] points) {
        // 向量相乘
        int[] v1 = {points[1][0] - points[0][0], points[1][1] - points[0][1]};
        int[] v2 = {points[2][0] - points[0][0], points[2][1] - points[0][1]};
        return v1[0] * v2[1] - v1[1] * v2[0] != 0;
    }

    /**
     * 1903
     *
     * @param num
     * @return
     */
    public String largestOddNumber(String num) {
        // 最大奇数 =>最后一个字符是奇数
        char[] arr = num.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            if ((arr[i] - '0') % 2 == 1) {
                return num.substring(0, i);
            }
        }
        return "";
    }

    /**
     * 1816
     *
     * @param s
     * @param k
     * @return
     */
    public String truncateSentence(String s, int k) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) == ' ' ? 1 : 0;
            if (count == 4) {
                return s.substring(0, i);
            }
        }
        return s;
    }

    /**
     * 1196
     *
     * @param weight
     * @return
     */
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int count = 0;
        int sum = 0;
        for (int i : weight) {
            sum += i;
            if (sum <= 5000) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    /**
     * 1935
     *
     * @param text
     * @param brokenLetters
     * @return
     */
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] chars = brokenLetters.split("");
        String[] words = text.split(" ");

        int ans = 0;
        for (String word : words) {
            ans += check(word, chars);
        }
        return ans;
    }

    private int check(String word, String[] chars) {
        for (String c : chars) {
            // 注意空串的处理
            if ("".equals(c)) {
                continue;
            }
            if (word.contains(c)) {
                return 0;
            }
        }
        return 1;
    }

    /**
     * 1684
     *
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        char[] arr = allowed.toCharArray();
        int[] ints = new int[26];
        for (char c : arr) {
            ints[c - 'a'] += 1;
        }

        int count = 0;
        for (String word : words) {
            boolean flag = true;
            char[] array = word.toCharArray();
            for (char c : array) {
                if (ints[c - 'a'] == 0) {
                    flag = false;
                    break;
                }
            }
            count += flag ? 1 : 0;
        }
        return count;
    }

    /**
     * 2405
     *
     * @param s
     * @return
     */
    public int partitionString(String s) {
        char[] arr = s.toCharArray();
        int i = 0, len = arr.length;
        int ans = 0;
        while (i < len) {
            Set<Character> set = new HashSet<>();
            set.add(arr[i]);
            i++;
            while (i < len && set.add(arr[i])) {
                i++;
            }
            ans++;
        }
        return ans;
    }

    /**
     * 2399
     *
     * @param s
     * @param distance
     * @return
     */
    public boolean checkDistances(String s, int[] distance) {
        char[] arr = s.toCharArray();
        int[] letters = new int[26];
        for (int i = 0; i < arr.length; i++) {
            letters[arr[i] - 'a'] = i - letters[arr[i] - 'a'] - 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (letters[i] != distance[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 1534
     *
     * @param arr
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int ans = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    ans += Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c ? 1 : 0;
                }
            }
        }
        return ans;
    }

    /**
     * 2303
     *
     * @param brackets
     * @param income
     * @return
     */
    public double calculateTax(int[][] brackets, int income) {
        int start = 0;
        double ans = 0;
        for (int[] bracket : brackets) {
            if (bracket[0] <= income) {
                ans += (bracket[0] - start) * bracket[1] * 0.01;
                start = bracket[0];
            } else {
                ans += (income - start) * bracket[1] * 0.01;
                return ans;
            }
        }
        return ans;
    }

    /**
     * 908
     *
     * @param nums
     * @param k
     * @return
     */
    public int smallestRangeI(int[] nums, int k) {
        // 数学思想 两数之差最小是0
        Arrays.sort(nums);
        int interval = nums[nums.length - 1] - nums[0];
        return Math.max(interval - 2 * k, 0);
    }

    /**
     * 2740
     *
     * @param nums
     * @return
     */
    public int findValueOfPartition(int[] nums) {
        // 等价于排序数组中的最小差值
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            ans = Math.min(ans, nums[i + 1] - nums[i]);
        }
        return ans;
    }

    /**
     * 1991
     *
     * @param nums
     * @return
     */
    public int findMiddleIndex(int[] nums) {
        // 求出总和
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 遍历模拟
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt * 2 == sum - nums[i]) {
                return i;
            }
            cnt += nums[i];
        }
        return -1;
    }

    /**
     * 1338
     *
     * @param arr
     * @return
     */
    public int minSetSize(int[] arr) {
        // 记录每个数字出现次数
        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.merge(i, 1, Integer::sum);
        }
        // 获取每个数字出现次数 并倒排
        List<Integer> collect = map.entrySet().stream().map(Map.Entry::getValue).sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
        int ans = 0;
        int sum = 0;
        for (Integer i : collect) {
            sum += i;
            ans++;
            if (sum * 2 >= len) {
                return ans;
            }
        }
        return ans;
    }

    /**
     * 2465
     *
     * @param nums
     * @return
     */
    public int distinctAverages(int[] nums) {
        // 数组排序
        Arrays.sort(nums);
        // 记录两个数的和 避免除丢失精度
        Set<Integer> set = new HashSet<>();
        int i = 0, j = nums.length - 1;
        while (i < j) {
            set.add(nums[i] + nums[j]);
            i++;
            j--;
        }
        return set.size();
    }

    /**
     * 1748
     *
     * @param nums
     * @return
     */
    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Objects::toString, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> Integer.valueOf(entry.getKey())).reduce(Integer::sum).orElse(0);
    }

    /**
     * 1941
     *
     * @param s
     * @return
     */
    public boolean areOccurrencesEqual(String s) {
        char[] arr = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.merge(c, 1, Integer::sum);
        }
        return new HashSet<>(map.values()).size() == 1;
    }

    /**
     * 2315
     *
     * @param s
     * @return
     */
    public int countAsterisks(String s) {
        // 建立标识
        char[] arr = s.toCharArray();
        int count = 0;
        boolean flag = false;
        for (char c : arr) {
            if (c == '|') {
                flag = !flag;
            } else {
                count += (!flag && c == '*') ? 1 : 0;
            }
        }
        return count;
    }

    /**
     * 2016
     *
     * @param nums
     * @return
     */
    public int maximumDifference(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans = Math.max(nums[j] - nums[i], ans);
            }
        }
        return ans > 0 ? ans : -1;
    }

    /**
     * 1668
     *
     * @param sequence
     * @param word
     * @return
     */
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(word);
            if (sequence.contains(sb.toString())) {
                ans++;
            } else {
                return ans;
            }
        }
    }

    /**
     * 2284
     *
     * @param messages
     * @param senders
     * @return
     */
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            map.merge(senders[i], messages[i].split(" ").length, Integer::sum);
        }
        String name="";
        int count=0;
        // 字符串比较使用compareTo方法
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>count || (entry.getValue()==count && entry.getKey().compareTo(name)>0)){
                count=entry.getValue();
                name=entry.getKey();
            }
        }
        return name;
    }


    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(new Similar().minSetSize(arr));
        int[][] brackets = {{3, 50}, {7, 10}, {12, 25}};
        int income = 10;
        System.out.println(new Similar().calculateTax(brackets, income));

        String[] strs = {"ad", "bd", "aaab", "baa", "badab"};
        String s = "ab";

        System.out.println(new Similar().partitionString("hdklqkcssgxlvehva"));
        System.out.println(new Similar().countConsistentStrings(s, strs));
    }
}
