package lc1400;

public class Question1221 {
    public int balancedStringSplit(String s) {
        // 一次扫描 判断两个字符的数量是否相等 相等则分段+1
        char[] arr = s.toCharArray();
        int lCount = 0, rCount = 0;
        int segs = 0;
        for (char c : arr) {
            lCount += c == 'L' ? 1 : 0;
            rCount += c == 'R' ? 1 : 0;
            segs += lCount == rCount ? 1 : 0;
        }
        return segs;
    }
}
