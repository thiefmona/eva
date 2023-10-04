package easy;

public class Question2119 {
    public boolean isSameAfterReversals(int num) {
        return num==reverseNum(reverseNum(num));
    }

    public int reverseNum(int num) {
        int ans = 0;
        while (num > 0) {
            ans = ans * 10 + num % 10;
            num /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Question2119().reverseNum(12300));
    }
}
