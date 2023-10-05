package lc1400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Question0973 {
    public int[][] kClosest(int[][] points, int k) {
        // 建立一个map 存储距原点距离和数组集合
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int[] point : points) {
            int area = point[0] * point[0] + point[1] * point[1];
            List<int[]> orDefault = map.getOrDefault(area, new ArrayList<>());
            orDefault.add(point);
            map.put(area, orDefault);
        }
        List<int[]> ans = new ArrayList<>();
        List<Integer> collect = map.keySet().stream().sorted().collect(Collectors.toList());
        for (Integer i : collect) {
            ans.addAll(map.get(i));
            if (ans.size() >= k) {
                int[][] res = new int[ans.size()][2];
                for (int j = 0; j < ans.size(); j++) {
                    int[] ints = ans.get(j);
                    res[j][0] = ints[0];
                    res[j][1] = ints[1];
                }
                return res;
            }
        }
        throw new IllegalArgumentException();
    }



    public static void main(String[] args) {

        System.out.println(new Question0973().kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2));
    }
}
