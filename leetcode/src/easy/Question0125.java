package easy;


import java.util.ArrayList;
import java.util.List;

public class Question0125 {
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        char[] array = lowerCase.toCharArray();

        List<Character> list = new ArrayList<>();

        for (char c : array) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                list.add(c);
            }
        }

        int j = 0;
        int k = list.size() - 1;
        while (j <= k) {
            if (list.get(j) != list.get(k)) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
