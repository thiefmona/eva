package lc1400;

import java.util.Arrays;

public class Question2605 {
    public int minNumber(int[] nums1, int[] nums2) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int i : nums1) {
            arr1[i] = 1;
        }

        for (int i : nums2) {
            arr2[i] = 1;
        }
        int min1 = 10;
        int min2 = 10;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i]==1 && arr2[i]==1) {
                return i;
            }
            min1 = arr1[i] == 1 ? Math.min(i, min1) : min1;
            min2 = arr2[i] == 1 ? Math.min(i, min2) : min2;
        }
        return Math.min(min1, min2) * 10 + Math.max(min1, min2);
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 3};
        int[] nums2 = {5, 7};
        System.out.println(new Question2605().minNumber(nums1,nums2));
    }
}
