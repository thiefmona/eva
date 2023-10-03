package easy;

import java.util.Arrays;

public class Question1046 {
    public int lastStoneWeight(int[] stones) {
        if (stones.length > 1) {
            Arrays.sort(stones);
            int i = stones[stones.length - 1] - stones[stones.length - 2];
            if (i > 0) {
                int[] temp = new int[stones.length - 1];
                for (int i1 = 0; i1 < temp.length - 1; i1++) {
                    temp[i1] = stones[i1];
                }
                temp[temp.length - 1] = i;
                return lastStoneWeight(temp);
            } else {
                int l = stones.length - 2;
                if(l==0){
                    return 0;
                }
                int[] temp = new int[l];
                for (int i1 = 0; i1 < temp.length; i1++) {
                    temp[i1] = stones[i1];
                }
                return lastStoneWeight(temp);
            }
        } else {
            return stones[0];
        }
    }
}
