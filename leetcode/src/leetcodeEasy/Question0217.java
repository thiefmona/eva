package leetcodeEasy;

import java.util.HashSet;
import java.util.Set;

public class Question0217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));

        int a=3,b=4,c=5;
        System.out.println(!(a > b)&&(b > c));

        String str1  =  "hello";
        String str2  =  "he" + new String("llo");
        System.out.println(str1 == str2);

        double v = 0.7132;
        String str = "runoob";
        str.toUpperCase();
        str += "wwwrunoobcom";
        String string = str.substring(2,13);
        string = string + str.charAt(4);;
        System.out.println(string);

    }
}
