package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Question0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            map1.compute(ransomNote.charAt(i), (k, v) -> {
                if (v == null) return 1;
                return v + 1;
            });
        }

        for (int i = 0; i < magazine.length(); i++) {
            map2.compute(magazine.charAt(i), (k, v) -> {
                if (v == null) return 1;
                return v + 1;
            });
        }

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if((!map2.containsKey(entry.getKey())) || map2.get(entry.getKey())< entry.getValue()){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        //只对map中存在的key对应的value进行操作
        Integer integer = map.computeIfPresent("3", (k, v) -> v + 1);
        Integer integer1 = map.computeIfPresent("4", (k, v) -> {
            if (v == null) return 0;
            return v + 1;
        });
        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(map.toString());


    }
}
