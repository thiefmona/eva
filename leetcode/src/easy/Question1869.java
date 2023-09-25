package easy;

public class Question1869 {
    public boolean checkZeroOnes(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int length = arr.length;
        int max0 = 0;
        int max1 = 0;
        while (i < length) {
            int left = i;
            i++;
            while (i < length && arr[i] == arr[i - 1]) {
                i++;
            }
            int right = i - 1;
            if (arr[right] == '0') {
                max0 = Math.max(max0, right - left + 1);
            } else {
                max1 = Math.max(max1, right - left + 1);
            }
        }
        return max1 > max0;
    }
}
