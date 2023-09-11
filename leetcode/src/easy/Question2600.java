package easy;

public class Question2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int result = 0;
        if (k <= numOnes) {
            result = k;
        } else if (k <= numOnes + numZeros) {
            result = numOnes;
        }else{
            result=numOnes-(k-numOnes-numZeros);
        }
        return result;
    }
}
