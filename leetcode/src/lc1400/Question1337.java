package lc1400;

import java.util.*;

public class Question1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = Arrays.stream(mat[i]).sum();
            List<Integer> list = map.getOrDefault(sum, new ArrayList<>());
            list.add(i);
            map.put(sum, list);
        }

        List<Integer> temp = new ArrayList<>();

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            for (Integer i : entry.getValue()) {
                temp.add(i);
                if (temp.size() == k) {
                    return temp.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }

        return temp.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k=3;
        System.out.println(Arrays.toString(new Question1337().kWeakestRows(arr,k)));
    }
}
