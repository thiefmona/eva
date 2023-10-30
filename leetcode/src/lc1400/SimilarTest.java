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

    @Test
    public void isArmstrong() {
        System.out.println(new Similar().isArmstrong(153));
    }

    @Test
    public void kthFactor() {
        System.out.println(new Similar().kthFactor(1,1));
    }

    @Test
    public void addToArrayForm() {
       int[] num= {9,9,9,9,9,9,9,9,9,9};
       // System.out.println(new Similar().addToArrayForm(num,1));
    }

    @Test
    public void maxDistance() {
        int[] colors={1,1,1,6,1,1,1};
        System.out.println(new Similar().maxDistance(colors));
    }

    @Test
    public void minMaxGame() {
        int[] arr={1,3,5,2,4,8,2,2};
        System.out.println(new Similar().minMaxGame(arr));
    }

    @Test
    public void greatestLetter() {
        System.out.println(new Similar().greatestLetter("lEeTcOdE"));
    }

    @Test
    public void twoSumLessThanK() {
        int[] nums={34,23,1,24,75,33,54,8};
        System.out.println(new Similar().twoSumLessThanK(nums,60));
    }


    @Test
    public void getCommon() {
        int[] nums1={1,2,3,6};
        int[] nums2={5};
        System.out.println(new Similar().getCommon(nums1,nums2));
    }

    @Test
    public void minSteps() {
        System.out.println(new Similar().minSteps("leetcode","coats"));
    }

    @Test
    public void digitCount() {
        System.out.println(new Similar().digitCount("1210"));
    }

    @Test
    public void getLucky() {
        System.out.println(new Similar().getLucky("leetcode",2));
    }

    @Test
    public void freqAlphabets() {
        String s = "10#11#12";
        System.out.println(new Similar().freqAlphabets(s));
    }

    @Test
    public void findTheArrayConcVal() {
        int[] nums = {7,52,2,4};
        System.out.println(new Similar().findTheArrayConcVal(nums));
    }

    @Test
    public void countDigits() {
        int num=121;
        System.out.println(new Similar().countDigits(num));
    }

    @Test
    public void minimumCost() {
        int[] cost={1,2,3};
        System.out.println(new Similar().minimumCost(cost));
    }

    @Test
    public void maximumTime() {
        String time = "1?:22";
        System.out.println(new Similar().maximumTime(time));
    }

    @Test
    public void groupThePeople() {
        int[] groupSizes={3,3,3,3,3,1,3};
        System.out.println(new Similar().groupThePeople(groupSizes));
    }

    @Test
    public void simplifiedFractions() {
        System.out.println(new Similar().simplifiedFractions(6));
    }

    @Test
    public void gcd() {
        System.out.println(new Similar().gcd(1,2));
    }
}