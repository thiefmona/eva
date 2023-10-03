package easy;

import java.util.*;

public class Easy {
    // 1450
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }

    // 977
    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(o -> o * o).sorted().toArray();
    }

    // 1929
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        return arr;
    }

    // 1295
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (count(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private int count(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    /**
     * 1491
     *
     * @param salary
     * @return
     */
    public double average(int[] salary) {
        int sum = 0;
        int min = salary[0];
        int max = salary[0];
        for (int i : salary) {
            sum += i;
            min = Math.min(i, min);
            max = Math.max(i, max);
        }
        sum = sum - min - max;
        return (double) sum / (salary.length - 2);
    }

    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int i1 = n % 10;
            sum += i1;
            product *= i1;
            n = n / 10;
        }
        return product - sum;
    }

    public int findJudge(int n, int[][] trust) {
        if (n == 1 && trust.length == 0) {
            return 1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int[] ints : trust) {
            set.add(ints[0]);
        }
        for (int[] ints : trust) {


            int count = map.getOrDefault(ints[1], 0) + 1;
            map.put(ints[1], count);
            if (count == n - 1 && !set.contains(ints[1])) {
                return ints[1];
            }
        }
        return -1;
    }

    /**
     * 1822
     *
     * @param nums
     * @return
     */
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            int i = signFunc(num);
            if (i == 0) {
                return 0;
            } else if (i == -1) {
                result *= -1;
            }
        }
        return result;
    }

    private int signFunc(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean checkString(String s) {
        int b = s.indexOf('b') == -1 ? s.length() + 1 : s.indexOf('b');
        //int a = s.lastIndexOf('a') == -1 ? s.length() + 1 : s.lastIndexOf(a);
        //  return a < b;
        return s.contains("ba");

    }

    /**
     * 1688
     *
     * @param n
     * @return
     */
    public int numberOfMatches(int n) {
        int count = 0;
        while (n > 0) {
            int i = n % 2;
            n = n / 2;
            if (n == 0) {
                break;
            }
            count += n;
            n = n + i;
        }
        return count;
    }

    /**
     * Q2169
     *
     * @param num1
     * @param num2
     * @return
     */
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
            count++;
        }
        return count;
    }


    /**
     * Q2000
     *
     * @param word
     * @param ch
     * @return
     */
    public String reversePrefix(String word, char ch) {
        String s = String.valueOf(ch);
        if (word.contains(s)) {
            int index = word.indexOf(ch);
            StringBuilder sb = new StringBuilder();
            String prefix = word.substring(0, index + 1);
            sb.append(prefix).reverse();
            sb.append(word.substring(index + 1));
            return sb.toString();

        } else {
            return word;
        }
    }

    /**
     * 2395
     *
     * @param nums
     * @return
     */
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (!set.add(nums[i] + nums[i + 1])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 1346
     *
     * @param arr
     * @return
     */
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] * 2)) {
                return true;
            } else if (map.containsKey(arr[i] >> 1)) {
                int i1 = arr[i] >> 1;
                if (i1 * 2 == arr[i]) {
                    return true;
                } else {
                    map.put(arr[i], i);
                }
            } else {
                map.put(arr[i], i);
            }
        }
        return false;
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Integer num : map.values()) {
            if (!set.add(num)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2529
     *
     * @param nums
     * @return
     */
    public int maximumCount(int[] nums) {
        int count = nums.length;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                negCount++;
            } else if (nums[i] == 0) {
                zeroCount++;
            } else {
                break;
            }
        }
        return Math.max(negCount, count - negCount - zeroCount);
    }

    /**
     * 2678
     *
     * @param details
     * @return
     */
    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            if (Integer.valueOf(detail.substring(11, 13)) > 60) {
                count++;
            }
        }
        return count;
    }

    /**
     * 1437
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.add(i);
            }
        }
        if (list.size() < 2) {
            return true;
        } else {
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) - list.get(i - 1) - 1 < k) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 1431
     *
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }


    /**
     * 1436
     *
     * @param paths
     * @return
     */
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }
        return getKey(map, map.keySet().iterator().next());
    }

    private String getKey(HashMap<String, String> map, String key) {
        if (map.containsKey(key)) {
            return getKey(map, map.get(key));
        } else {
            return key;
        }
    }

    /**
     * @param num
     * @return
     */
    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    /**
     * 2247
     *
     * @param a
     * @param b
     * @return
     */
    public int commonFactors(int a, int b) {
        // 判断大的数 遍历
        if (a > b) {
            return commonFactors(b, a);
        } else {
            int count = 0;
            for (int i = 1; i <= a; i++) {
                count += (a % i == 0 && b % i == 0) ? 1 : 0;
            }
            return count;
        }
    }

    /**
     * 2441
     *
     * @param nums
     * @return
     */
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        // 双指针
        int left = 0;
        int right = nums.length - 1;
        while (nums[left] < 0 && nums[right] > 0) {
            if (nums[left] * -1 < nums[right]) {
                right--;
            } else if (nums[left] * -1 > nums[right]) {
                left++;
            } else {
                return nums[right];
            }
        }
        return -1;
    }

    /**
     * 1913
     *
     * @param nums
     * @return
     */
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }

    /**
     * 1470
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        // 1 2 3 4 5 6
        // 1 4 2 5 3 6
        int[] result = new int[2 * n];
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[i + n];
        }
        return result;
    }

    /**
     * 1351
     *
     * @param grid
     * @return
     */
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int i1 = 0; i1 < grid[i].length; i1++) {
                if (grid[i][i1] < 0) {
                    count += grid[i].length - i1;
                    break;
                }
            }
        }
        return count;
    }

    /**
     * 1137
     *
     * @param n
     * @return
     */
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n < 3) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }
        return arr[n];
    }

    /**
     * 1460
     *
     * @param target
     * @param arr
     * @return
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if (target[i] != arr[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2778
     *
     * @param nums
     * @return
     */
    public int sumOfSquares(int[] nums) {
        // 遍历
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (n % (i + 1) == 0) {
                sum += nums[i] * nums[i];
            }
        }
        return sum;
    }

    /**
     * 2089
     *
     * @param nums
     * @param target
     * @return
     */
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * 1502
     *
     * @param arr
     * @return
     */
    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length == 2) {
            return true;
        }
        Arrays.sort(arr);
        int interval = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != interval) {
                return false;
            }
        }
        return true;
    }

    /**
     * 2351
     *
     * @param s
     * @return
     */
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (!set.add(c)) {
                return c;
            }
        }
        throw new IllegalArgumentException("非法参数异常");
    }

    /**
     * 1920
     *
     * @param nums
     * @return
     */
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    /**
     * 1512
     *
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                count += nums[i] == nums[j] ? 1 : 0;
            }
        }
        return count;
    }

    /**
     * 0961
     *
     * @param nums
     * @return
     */
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            if (count == nums.length / 2) {
                return num;
            }
            map.put(num, count);
        }
        throw new IllegalArgumentException("illegal argument");
    }

    /**
     * 2778
     *
     * @param s
     * @param letter
     * @return
     */
    public int percentageLetter(String s, char letter) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (char c : arr) {
            count += c == letter ? 1 : 0;
        }
        double var = (double) count / s.length() * 100;
        return (int) var;
    }

    /**
     * 1342
     *
     * @param num
     * @return
     */
    public int numberOfSteps(int num) {
        int steps = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            steps++;
        }
        return steps;
    }

    /**
     * 1374
     *
     * @param n
     * @return
     */
    public String generateTheString(int n) {
        char a = 'a';
        char b = 'b';
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append(a);
            }
            sb.append(b);
        } else {
            for (int i = 0; i < n; i++) {
                sb.append(a);
            }
        }
        return sb.toString();
    }

    /**
     * 2713
     *
     * @param num
     * @return
     */
    public String removeTrailingZeros(String num) {
        char[] arr = num.toCharArray();
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != '0') {
                index = i;
                break;
            }
        }
        return num.substring(0, index + 1);
    }

    /**
     * 2713
     *
     * @param operations
     * @return
     */
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String op : operations) {
            if (op.contains("+")) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }

    /**
     * 1832
     *
     * @param sentence
     * @return
     */
    public boolean checkIfPangram(String sentence) {
        int[] result = new int[26];
        char[] arr = sentence.toCharArray();
        for (char c : arr) {
            result[c - 'a'] += 1;
        }
        for (int i : result) {
            if (i == 0) {
                return false;
            }
        }
        return true;
    }

    public int prefixCount(String[] words, String pref) {
        int sum = 0;
        for (String word : words) {
            sum += word.startsWith(pref) ? 1 : 0;
        }
        return sum;
    }

    /**
     * 1304
     *
     * @param n
     * @return
     */
    public int[] sumZero(int n) {
        if (n % 2 == 0) {
            int l = n / 2;
            int[] arr = new int[n];
            for (int i = 0; i < l; i++) {
                arr[2 * i] = i + 1;
                arr[2 * i + 1] = -arr[2 * i];
            }
            return arr;
        } else {
            int l = (n - 1) / 2;
            int[] arr = new int[n];
            for (int i = 0; i < l; i++) {
                arr[2 * i] = i + 1;
                arr[2 * i + 1] = -arr[2 * i];
            }
            arr[n - 1] = 0;
            return arr;
        }
    }

    /**
     * 2057
     *
     * @param nums
     * @return
     */
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 2651
     *
     * @param arrivalTime
     * @param delayedTime
     * @return
     */
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    /**
     * 922
     *
     * @param nums
     * @return
     */
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int i = 0, j = i + 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                arr[i] = num;
                i += 2;
            } else {
                arr[j] = num;
                j += 2;
            }
        }
        return arr;
    }

    public int[] rowAndMaximumOnes(int[][] mat) {
        int count = 0;
        int[] result = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int tempCount=0;
            for (int i1 : mat[i]) {
                tempCount += i1;
            }
            if(tempCount>count){
                result= new int[]{i, tempCount};
                count=tempCount;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Easy().sortArrayByParityII(new int[]{4, 2, 5, 7}));

        System.out.println(Arrays.toString(new Easy().sumZero(4)));

        System.out.println(new Easy().tribonacci(4));


//        int i = new Easy().numberOfMatches(7);
//        System.out.println(i);
//
//        String str = "123";
//        String substring = str.substring(3);
//        System.out.println("demo:" + substring);
//        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(new Easy().findSubarrays(arr));
        //System.out.println(new Easy().commonFactors(12, 6));
        //System.out.println(new Easy().findMaxK(new int[]{-1, 2, -3, 3}));

        // System.out.println(Arrays.toString(new Easy().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));

        //  System.out.println(new Easy().countNegatives(new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}}));

    }


}
