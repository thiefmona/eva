package easy;

public class Question1957 {
    public String makeFancyString(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int length = arr.length;
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int left = i;
            i++;
            while (i < length && arr[i] == arr[i - 1]) {
                i++;
            }
            int right = i - 1;
            if (right - left >= 2) {
                sb.append(s, left, left+2);
            } else {
                sb.append(s, left, right+1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Question1957 q = new Question1957();
        String leeetcode = q.makeFancyString("leeetcode");
        System.out.println(leeetcode);
    }
}
