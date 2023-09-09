package leetcodeEasy;

import java.util.List;

public class Question2828 {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        words.forEach(word -> sb.append(word.charAt(0)));


        return sb.toString().equals(s);
    }
}
