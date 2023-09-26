package mdeium;

public class Question2210 {
    public long getDescentPeriods(int[] prices) {
        int i = 0;
        int len = prices.length;
        long sum=0;
        while (i < len) {
            int left = i;
            i++;
            while (i < len && prices[i] == prices[i - 1] - 1) {
                i++;
            }
            int right = i ;
            sum+=(long)(1+right-left)*(right-left)/2;
        }
        return sum;
    }

    public static int countHomogenous(int[] arr) {

        int i = 0;
        int length = arr.length;
        long sum = 0;
        while (i < length) {
            int left = i;
            i++;
            while (i < length && arr[i] == arr[i - 1]) {
                i++;
            }
            int right = i;
            sum += (long) (right - left) * (right - left + 1) / 2;
        }
        return (int) sum ;
    }
}
