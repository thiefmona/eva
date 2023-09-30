package easy;

public class Question1480 {
    public int[] runningSum(int[] nums) {
//        int sum=0;
//        int[] arr=new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            sum=sum+nums[i];
//            arr[i]=sum;
//        }
//        return arr;
        if (nums.length==1)
                return nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
