package mdeium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question0056 {
    public static int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (interval1, interval2) -> interval1[0] - interval2[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 0; i < intervals.length; ) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);

            } else {
                int[] temp = {start, end};
                list.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
            i++;
            if (i == intervals.length) {
                int[] temp = {start, end};
                list.add(temp);
            }


        }

        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
