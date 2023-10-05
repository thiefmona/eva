package lc1400;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2533 {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            StringBuilder temp = new StringBuilder();
            while (num > 0) {
                temp.append(num % 10);
                num /= 10;
            }
            temp.reverse();
            sb.append(temp);
        }
        String str = sb.toString();
        int[] ans = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ans[i] = str.charAt(i) - '0';
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Question2533().separateDigits(new int[]{123})));
    }
}
