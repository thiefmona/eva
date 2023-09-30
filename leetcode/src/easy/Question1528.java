package easy;

import java.util.HashMap;

public class Question1528 {
    public String restoreString(String s, int[] indices) {
        char[] array = s.toCharArray();
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i],i);
        }
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[map.get(i)]);
        }
        return sb.toString();
    }
}
