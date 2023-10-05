package lc1400;

public class Question0941 {
    public boolean validMountainArray(int[] arr) {
        // arr.lenth>=3
        if (arr.length < 3) {
            return false;
        }
        // 找出高点
        int left = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] <= 0) {
                left = i - 1;
                break;
            }
        }
        // 找出低点
        int right = arr.length - 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] - arr[i + 1] <= 0) {
                right = i + 1;
                break;
            }
        }
        // 比较高点是不是等于低点的位置
        return left == right;
    }

    public static void main(String[] args) {
        System.out.println(new Question0941().validMountainArray(new int[]{3,5,5}));
    }
}
