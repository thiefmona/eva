package mdeium;

public class Question1578 {
    public int minCost(String colors, int[] neededTime) {
        char[] arr = colors.toCharArray();
        int i = 0;
        int len = arr.length;
        int sum = 0;
        while (i < len) {
            int left = i;
            i++;
            while (i < len && arr[i] == arr[i - 1]) {
                i++;
            }
            int right = i-1;
            if (left < right) {

                int max=neededTime[left];
                for (int k = left+1; k <= right; k++) {
                    if(max>neededTime[k]){
                        sum+=neededTime[k];
                    }else{
                        sum+=max;
                        max=neededTime[k];
                    }
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        String colors = "aaabbbabbbb";
        int[] neededTime = {3, 5, 10, 7, 5, 3, 5, 5, 4, 8, 1};
        System.out.println(new Question1578().minCost(colors,neededTime));
    }
}
