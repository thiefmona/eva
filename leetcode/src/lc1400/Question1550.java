package lc1400;

public class Question1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        // 用char数组表示奇偶 转换成字符串 判断是否含有111连续的字符
        char[] chars = new char[arr.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = arr[i] % 2 == 0 ? '0' : '1';
        }
        return new String(chars).contains("111");
    }
}
