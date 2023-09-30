package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

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
            if(n==0){
                break;
            }
            count += n;
            n=n+i;
        }
        return count;
    }


    public static void main(String[] args) {
        int i = new Easy().numberOfMatches(7);
        System.out.println(i);
    }
}
