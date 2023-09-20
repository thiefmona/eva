package easy;

import java.util.HashMap;

public class Question0290 {
    public boolean wordPattern(String pattern, String s) {
        char[] arr = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if (arr.length != strArr.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map1.containsKey(arr[i]) && !map1.get(arr[i]).equals(strArr[i])) {
                return false;
            }
            if (map2.containsKey(strArr[i]) && map2.get(strArr[i]) != arr[i]) {
                return false;
            }
            map1.put(arr[i], strArr[i]);
            map2.put(strArr[i], arr[i]);
        }
        return true;
    }
}
