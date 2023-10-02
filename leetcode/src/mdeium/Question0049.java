package mdeium;

import java.util.*;
import java.util.stream.Collectors;

public class Question0049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] chars = new int[26];
            char[] arr = strs[i].toCharArray();
            for (char c : arr) {
                chars[c - 'a'] += 1;
            }
            StringBuilder sb = new StringBuilder();
            for (int i1 = 0; i1 < chars.length; i1++) {
                if (chars[i1] > 0) {
                    sb.append((char) (i1 + 'a')).append(chars[i1]);
                }

            }
            List<String> list = map.getOrDefault(sb.toString(), new ArrayList<>());
            list.add(strs[i]);
            map.put(sb.toString(),list);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] vars = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Question0049().groupAnagrams(vars));
    }
}
