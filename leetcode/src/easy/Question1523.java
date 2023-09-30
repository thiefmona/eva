package easy;

public class Question1523 {
    public int countOdds(int low, int high) {
        // 4,5,6,7     4,5,6

        // 3,4,5,6     3,4,5
        int interval = high - low;
        if (interval % 2 == 0) {
            return interval / 2 + 1;
        } else {
            return interval / 2 + low % 2;
        }


    }
}
