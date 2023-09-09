package leetcodeEasy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question2788 {
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = Collections.emptyList();
        for (String word : words) {
            String s1 = String.valueOf(separator);
            // regex . 正则判断
            String[] split = word.split(s1);
            for (String s : split) {
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> list=Arrays.asList("one.two.three","four.five","six");
        String[] split = "one.two.three".split("/.");
        System.out.println(Arrays.toString(split));

        System.out.println(splitWordsBySeparator(list,'.'));
    }
}
