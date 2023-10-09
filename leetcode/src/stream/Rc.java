package stream;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Rc {
    /**
     * 1748
     *
     * @param nums
     * @return
     */
    public int sumOfUnique(int[] nums) {
        return Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Objects::toString, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> Integer.valueOf(entry.getKey())).reduce(Integer::sum).orElse(0);
    }
}
