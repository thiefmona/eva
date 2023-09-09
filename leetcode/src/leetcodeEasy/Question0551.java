package leetcodeEasy;

public class Question0551 {
    public static boolean checkRecord(String s) {
        char[] array = s.toCharArray();
        int aSum = 0;
        int lSum = 0;
        for (int i = 0; i < array.length; i++) {
            if ('A' == array[i]) {
                aSum++;
                lSum = 0;
                if (aSum >= 2) {
                    return false;
                }
            } else if ('L' == array[i]) {
                lSum++;
                if (lSum >= 3) {
                    return false;
                }
            } else {
                lSum = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        checkRecord("AA");
    }
}
