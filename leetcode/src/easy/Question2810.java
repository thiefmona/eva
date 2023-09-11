package easy;

public class Question2810 {
    public String finalString(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
