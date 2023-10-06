package lc1400;

import java.util.ArrayList;
import java.util.List;

public class Question1417 {
    public String reformat(String s) {
        char[] arr = s.toCharArray();
        // 拆分字符串
        List<Character> number = new ArrayList<>();
        List<Character> alphabet = new ArrayList<>();
        for (char c : arr) {
            if (c >= '0' && c <= '9') {
                number.add(c);
            } else {
                alphabet.add(c);
            }
        }
        return number.size() < alphabet.size() ? spliceStrs(number, alphabet) : spliceStrs(alphabet, number);
    }

    private String spliceStrs(List<Character> list1, List<Character> list2) {
        // 两个字符数组长度差1以上 无法组成字符串
        if (list2.size() - list1.size() > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list1.size(); i++) {
            sb.append(list1.get(i));
            sb.append(list2.get(i));
        }
        // 判断字符串2的长度是否需要在前面拼接
        return (list2.size() > list1.size() ? list2.get(list2.size() - 1) : "") + sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Question1417().reformat("1229857369"));
    }
}
