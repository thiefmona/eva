package mdeium;

public class Question2243 {
    public String digitSum(String s, int k) {
        if (s.length() <= k) {
            return s;
        } else {
            char[] charArray = s.toCharArray();
            int[] arr = new int[charArray.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] =charArray[i]-'0';
            }
            int length = s.length();
            StringBuilder sb = new StringBuilder();
            int count = s.length() / k + (s.length() % k == 0 ? 0 : 1)-1;
            for (int i = 0; i <= count; i++) {
                int sum = 0;
                int end = i == count ? s.length() : (i+1) * k;
                for (int j = i * k; j < end; j++) {
                    sum += arr[j];
                }
                sb.append(sum);
            }
            return digitSum(sb.toString(), k);
        }

    }

    public static void main(String[] args) {
        String s="11111222223";
        int k=3;
        System.out.println(new Question2243().digitSum(s,3));
    }


}
