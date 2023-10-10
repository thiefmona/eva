package lc1400;

import org.junit.Before;
import org.junit.Test;

public class SimilarTest {

    @Test
    public void minSetSize() {
        int[] arr = {3, 3, 3, 3, 5, 5, 5, 2, 2, 7};
        System.out.println(new Similar().minSetSize(arr));
    }

    @Test
    public void countAsterisks() {
        System.out.println('a' - 'A');
        System.out.println(new Similar().countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    @Test
    public void maximumDifference() {
        System.out.println(new Similar().maximumDifference(new int[]{1, 5, 2, 10}));
    }

    @Test
    public void maxRepeating() {
        // System.out.println(new Similar().maxRepeating());
    }

    @Test
    public void largestWordCount() {
        String[] messages = {"How is leetcode for everyone", "Leetcode is useful for practice"};
        String[] senders = {"Bob", "Charlie"};
        System.out.println(new Similar().largestWordCount(messages, senders));
    }

    @Test
    public void backspaceCompare() {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(new Similar().backspaceCompare(s,t));
    }

    @Test
    public void countGoodRectangles() {
        int[][] arr={{5,8},{3,9},{3,12}};
        System.out.println(new Similar().countGoodRectangles(arr));
    }
}