package easy;

import java.util.Arrays;
import java.util.Comparator;

public class Question0014 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        int length = strs[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = strs[0].charAt(i);
            int finalI = i;
            boolean b = Arrays.stream(strs).allMatch(str -> str.charAt(finalI) == c);
            if(b){
                sb.append(c);
            }else{
                return sb.toString();
            }
        }
        return sb.toString().isEmpty()?"":strs[0];
    }
}
