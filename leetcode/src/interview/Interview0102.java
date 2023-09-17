package interview;

import java.util.Arrays;

public class Interview0102 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            int[] nums1 = new int[26];
            int[] nums2 = new int[26];

            for (int i = 0; i < arr1.length; i++) {
                nums1[arr1[i] - 'a'] += 1;
                nums2[arr2[i] - 'a'] += 1;
            }

            for (int i = 0; i < nums1.length; i++) {
                if (nums1[i] != nums2[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}
