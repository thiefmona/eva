package interview;

public class Interview0103 {
    public String replaceSpaces(String S, int length) {
        char[] strArr = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if ( strArr[i]==' '){
                sb.append("%20");
            }else{
                sb.append(strArr[i]);
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Mr%20John%20Smith".length());
        System.out.println("Mr John Smith    ".length());
    }
}
