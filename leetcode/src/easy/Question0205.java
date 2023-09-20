package easy;

import java.util.HashMap;

public class Question0205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 1) {
            return true;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (map.containsKey(c)) {
                if (c1 != map.get(c)) {
                    return false;
                }
            }else {
                map.put(c, c1);
            }

            if(map1.containsKey(c1)){
                if(c!=map1.get(c1)){
                    return false;
                }
            }else{
                map.put(c1,c);
            }
        }
        return true;
    }
}
