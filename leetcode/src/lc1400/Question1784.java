package lc1400;

public class Question1784 {
    public boolean checkOnesSegment(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int len = s.length();
        int segs = 0;
        while (i < len) {
            while (i < len && arr[i] != '1') {
                i++;

            }
            if (i == len) {
                break;
            }
            int left = i;
            i++;
            while (i < len && arr[i] == '1') {
                i++;
            }
            int right = i - 1;
            if (arr[left] == '1' && arr[right] == '1') {
                segs++;
                if (segs > 1) {
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Question1784().checkOnesSegment("110"));
    }
}
