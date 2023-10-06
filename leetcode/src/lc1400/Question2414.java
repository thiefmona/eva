package lc1400;

public class Question2414 {
    public int longestContinuousSubstring(String s) {
        int ans = 0;
        // 分段扫描
        char[] arr = s.toCharArray();
        int i = 0, len = arr.length;
        while (i < len) {
            int left = i;
            i++;
            while (i < len && arr[i] - arr[i - 1] == 1) {
                i++;
            }
            int right = i;
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}
