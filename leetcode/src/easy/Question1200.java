package easy;

import java.util.*;

public class Question1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i = 1; i < arr.length; i++) {
            int interval = arr[i] - arr[i - 1];
            List<List<Integer>> lists = map.getOrDefault(interval, new ArrayList<>());
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i - 1]);
            temp.add(arr[i]);
            lists.add(temp);
            map.put(interval, lists);
        }
        Integer i = map.keySet().stream().min(Integer::compareTo).get();
        return map.get(i);
    }
}
