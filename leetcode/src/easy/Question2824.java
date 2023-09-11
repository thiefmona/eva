package easy;

import java.util.Arrays;
import java.util.List;

public class Question2824 {
    public static int  countPairs(List<Integer> nums, int target) {
        int sum=0;
        for (int i = 0; i < nums.size()-1; i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)+nums.get(j)<target){
                    sum++;

                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-6,2,5,-2,-7,-1,3);
        countPairs(list,-2);
    }

}
