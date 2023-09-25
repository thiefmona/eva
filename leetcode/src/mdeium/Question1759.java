package mdeium;

public class Question1759 {
    public static int countHomogenous(String s) {
        char[] arr = s.toCharArray();
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
        return (int) (sum % 1000000007);
    }

    public static void main(String[] args) {
        System.out.println(countHomogenous("abbcccaa"));
    }
}
