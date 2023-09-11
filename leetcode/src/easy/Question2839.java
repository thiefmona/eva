package easy;

import java.util.Arrays;

public class Question2839 {
    public boolean canBeEqual(String s1, String s2) {
        int[][] arr1 = new int[2][26];
        int[][] arr2 = new int[2][26];
        for (int i = 0; i < s1.length(); i++) {
            arr1[i % 2][s1.charAt(i) - 'a']++;
            arr2[i % 2][s2.charAt(i) - 'a']++;
        }

        for (int[] ints : arr1) {
            System.out.println(Arrays.toString(ints));
        }

        for (int[] ints : arr2) {
            System.out.println(Arrays.toString(ints));
        }
        return Arrays.deepEquals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(new Question2839().canBeEqual(s1, s1));
    }

}
