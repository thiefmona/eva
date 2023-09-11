package easy;

import java.util.ArrayList;
import java.util.List;

public class Question0448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] arr = new int[nums.length + 1];
        for (int num : nums) {
            arr[num] += 1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
