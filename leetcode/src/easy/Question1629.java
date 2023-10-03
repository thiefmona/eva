package easy;

public class Question1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        for (int i = releaseTimes.length - 1; i > 0; ) {
            releaseTimes[i] -= releaseTimes[--i];
        }

        char[] array = keysPressed.toCharArray();

        int count = 0;
        int index = 0;
        for (int i = 0; i < releaseTimes.length; i++) {
            if (releaseTimes[i] > count) {
                count = releaseTimes[i];
                index = i;
            } else if (releaseTimes[i] == count) {
                index = array[i] - 'a' > array[index] - 'a' ? i : index;
            }

        }
        return array[index];
    }

    public static void main(String[] args) {
        System.out.println(new Question1629().slowestKey(new int[]{9, 29, 49, 50}, "cbad"));
    }
}
