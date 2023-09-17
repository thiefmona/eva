package interview;

public class Interview0106 {
    public static String compressString(String S) {
        if (S.length() == 0) {
            return S;
        }
        StringBuilder sb = new StringBuilder();
        char[] arr = S.toCharArray();
        int q = 0;
        int s = 0;
        while (q < arr.length) {
            if (arr[q] == arr[s]) {
                q++;
                if (q == arr.length ) {
                    sb.append(arr[s]);
                    sb.append(q - s );
                }
            } else {
                sb.append(arr[s]);
                sb.append(q - s);
                s = q;
                q++;
                if (q == arr.length ) {
                    sb.append(arr[s]);
                    sb.append(q - s );
                }
            }
        }
        return sb.toString().length()<S.length()?sb.toString():S;
    }

    public static void main(String[] args) {
        String s="bbbac";
        System.out.println(compressString(s));
    }
}
