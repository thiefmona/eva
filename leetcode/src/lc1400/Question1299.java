package lc1400;

import java.util.Arrays;

public class Question1299 {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];
        // 从后往前遍历
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = max;
            max = Math.max(arr[i], max);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Question1299().replaceElements(new int[]{17,18,5,4,6,1})));
    }
}
