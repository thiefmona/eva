package lc1400;

public class Question2432 {
    public int hardestWorker(int n, int[][] logs) {
        int ans = 0;
        int start = 0;
        int interval = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i][1] - start > interval) {
                ans = logs[i][0];
                interval = logs[i][1] - start;
            } else if (logs[i][1] - start == interval) {
                if (logs[i][0] < ans) {
                    ans = logs[i][0];
                }
            }
            start = logs[i][1];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Question2432().hardestWorker(10,new int[][]{{0,3},{2,5},{0,9},{1,15}}));
    }
}
