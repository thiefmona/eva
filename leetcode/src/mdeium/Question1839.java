package mdeium;

import java.util.HashSet;
import java.util.Set;

public class Question1839 {
    public int longestBeautifulSubstring(String word) {
        char[] arr = word.toCharArray();
        int i = 0;
        int len = arr.length;
        System.out.println(len);
        int maxLen = 0;
        while (i < len) {
            int left =i;
            i++;
            Set<Character> set = new HashSet<>();
            while (i < len && (int) arr[i] - arr[i - 1] >= 0) {
                set.add(arr[i - 1]);
                set.add(arr[i]);
                i++;
            }
            int right = i - 1;
            if (set.size() == 5) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen;
    }


    public static void main(String[] args) {
        String word = "aeioua";
        System.out.println(new Question1839().longestBeautifulSubstring(word));
    }
}
