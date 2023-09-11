package easy;


public class Question0058 {
    public static int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        sb.append(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i] != ' ') {
                if(array[i-1]==' '){
                    sb=new StringBuilder();
                }
                sb.append(array[i]);
            }
        }
        System.out.println(sb.toString());
        return sb.toString().length();
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(str));
    }
}
