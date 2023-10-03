package easy;

public class Question1768 {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        char[] arr = new char[l1 + l2];
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (j < l1)
                arr[i++] = word1.charAt(j);
            if (j < l2)
                arr[i++] = word2.charAt(j);
            j++;
        }
        return new String(arr);
    }
}
