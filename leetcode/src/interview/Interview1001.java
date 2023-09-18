package interview;

import java.util.Arrays;

public class Interview1001 {
    public static void merge(int[] A, int m, int[] B, int n) {
        int j = m - 1;
        int k = n - 1;
        int index = A.length - 1;
        while (j > 0 || k > 0) {
            if (A[j] >= B[k]) {
                A[index] = A[j];
                j--;
            } else {
                A[index] = B[k];
                k--;
            }
            index--;
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] B = {2, 5, 6};
        int n = 3;
        merge(A, 3, B, 3);
        System.out.println(Arrays.toString(A));
    }
}
