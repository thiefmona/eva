package mdeium;

import java.util.HashMap;

public class Question0347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
