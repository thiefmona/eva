package easy;

public class Question1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return strToNum(firstWord) + strToNum(secondWord) == strToNum(targetWord);
    }

    public int strToNum(String word) {
        char[] arr = word.toCharArray();
        int ans = 0;
        for (char c : arr) {
            ans = ans * 10 + c - 'a';
        }
        return ans;
    }
}
