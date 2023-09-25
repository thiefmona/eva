package easy;

public class Question1446 {
    public int maxPower(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int length = arr.length;
        int max = 0;
        while (i < length) {
            int left = i;
            i++;
            while (i < length && arr[i] == arr[i - 1]) {
                i++;
            }
            int right = i - 1;
            max = Math.max(max, right - left+1);
        }
        return max;
    }
}
