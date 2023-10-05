package lc1400;

import java.util.Arrays;
import java.util.Optional;

public class Question2108 {
    public String firstPalindrome(String[] words) {
        return Arrays.stream(words).filter(word -> {
            char[] arr = word.toCharArray();
            int l = 0, r = arr.length - 1;
            while (l < r) {
                if (arr[l] != arr[r]) {
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }).findFirst().orElse("");
    }

    public boolean checkPalindrome(String word) {
        char[] arr = word.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (arr[l] != arr[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
