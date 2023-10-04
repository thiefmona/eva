package easy;

public class Question2544 {
    public int alternateDigitSum(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int ans = 0;
        int flag = -1;
        for (char c : arr) {
            flag = flag * -1;
            ans += (c - '0') * flag;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Question2544().alternateDigitSum(521));
    }
}
