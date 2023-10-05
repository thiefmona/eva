package lc1400;

public class Question1704 {
    public boolean halvesAreAlike(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int n = s.length() / 2;
        int left = 0;
        for (int i = 0; i < n; i++) {
            left += (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'
                    || arr[i] == 'o' || arr[i] == 'u') ? 1 : 0;
        }

        int right = 0;
        for (int i = n; i < 2 * n; i++) {
            right += (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i'
                    || arr[i] == 'o' || arr[i] == 'u') ? 1 : 0;
        }
        return left == right;
    }
}
