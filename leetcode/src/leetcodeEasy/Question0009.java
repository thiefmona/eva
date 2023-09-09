package leetcodeEasy;

public class Question0009 {
    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();
        int j = 0, k = array.length - 1;
        while (j <= k) {
            if (array[j] != array[k]) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
