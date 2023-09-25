package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Question0228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int i =0;
        int length=nums.length;
        while(i<length){
            int low=i;
            i++;
            while(i<length && nums[i]==nums[i-1]+1){
                i++;
            }
            int high=i-1;
            StringBuilder sb=new StringBuilder();
            sb.append(nums[low]);
            if(low<high){
                sb.append("->").append(nums[high]);
            }
            list.add(sb.toString());
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        List<String> re = summaryRanges(nums);
        System.out.println(re);
    }
}
