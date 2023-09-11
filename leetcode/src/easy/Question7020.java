package easy;

public class Question7020 {
    public static int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int index = low; index <= high; index++) {
            String s = String.valueOf(index);
            int length = s.length();
            if (length % 2 != 0) {
                continue;
            } else {
                String half1 = s.substring(0, length / 2);
                String half2 = s.substring(length / 2, s.length() );

                char[] array1 = half1.toCharArray();
                char[] array2 = half2.toCharArray();

                int sum1 = 0;
                for (char c : array1) {
                    sum1 += c;
                }

                int sum2 = 0;
                for (char c : array2) {
                    sum2 += c;
                }

                if (sum1 == sum2) {
                    count++;
                }

            }

        }
        return count;
    }

    public static void main(String[] args) {
        int i = countSymmetricIntegers(1, 100);
        System.out.println(i);
    }
}
