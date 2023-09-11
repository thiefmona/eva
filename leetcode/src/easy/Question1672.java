package easy;

public class Question1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                sum += accounts[i][j];
                max = max > sum ? max : sum;
            }
        }
        return max;

//        return Arrays.stream(accounts).
//                map(Arrays::stream).mapToInt(IntStream::sum).reduce(0, Math::max);

    }

    public static void main(String[] args) {
        int[][] num = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(num.length);
        System.out.println(num[1].length);
    }
}
