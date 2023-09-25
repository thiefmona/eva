package lcr;

public class LCR181 {
    public static String reverseMessage(String message) {
        String[] arr = message.trim().split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "  hello world!  ";
        System.out.println(reverseMessage(str));
    }
}
