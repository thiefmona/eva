package lc1400;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question2729 {
    public boolean isFascinating(int n) {
        List<Integer> list = (n + String.valueOf(2 * n) + 3 * n).chars().mapToObj(c -> c - '0').collect(Collectors.toList());
        System.out.println(list);
        Set<Integer> set = new HashSet<>();

        for (Integer i : list) {
            if (i == 0 || !set.add(i)) {
                return false;
            }
        }
        return set.size() == 9;
    }

    public static void main(String[] args) {
        System.out.println(new Question2729().isFascinating(267));
    }
}
