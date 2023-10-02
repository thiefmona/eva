package easy;

public class Question1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] arr = s.toCharArray();
        int result = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    result = Math.max(result, j - i - 1);
                }
            }
        }
        return result;
    }
}
