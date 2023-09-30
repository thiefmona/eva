package easy;

import java.util.Arrays;

public class Question1394 {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length - 1;
        while (n >= 0) {
            int right = n;
            n--;
            while (n >= 0 && arr[n] == arr[n + 1]) {
                n--;
            }
            int left = n+1;

            if (arr[right] == (right - left+1)) {
                return arr[right];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,3};
        System.out.println(new Question1394().findLucky(arr));
    }
}
