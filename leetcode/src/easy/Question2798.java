package easy;

public class Question2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum = 0;
        for (int hour : hours) {
            if (hour >= target) {
                sum++;
            }
        }
        return sum;
    }
}
