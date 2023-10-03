package easy;

public class Question2455 {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num % 6 == 0 ? num : 0;
            count += num % 6 == 0 ? 1 : 0;
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void main(String[] args) {
        System.out.println(new Question2455().averageValue(new int[]{4,4,9,10}));
    }
}
