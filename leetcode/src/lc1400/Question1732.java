package lc1400;

public class Question1732 {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int height = 0;
        for (int i : gain) {
            height += i;
            ans = Math.max(ans, height);
        }
        return ans;
    }
}
