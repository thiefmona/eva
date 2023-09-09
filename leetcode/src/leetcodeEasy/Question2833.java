package leetcodeEasy;

public class Question2833 {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int k = 0;
        for (int i = 0; i < moves.length(); i++) {
            if ('L' == moves.charAt(i)) {
                l++;
            } else if ('R' == moves.charAt(i)) {
                r++;
            } else {
                k++;
            }
        }
        return Math.abs(l - r) + k;
    }
}
