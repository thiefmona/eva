package interview;

public class Interview0105 {
    public static void main(String[] args) {
        String first = "pale";
       String second = "pcle";
        System.out.println(oneEditAway(first,second));
    }

    public static boolean oneEditAway(String first, String second) {
        int l1 = first.length();
        int l2 = second.length();
        if (Math.abs(l1 - l2) > 1) {
            return false;
        }
        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();


        if (l1 == l2) {
            return checkSameLength(arr1,arr2);

        }else if(l1>l2){
            return checkDifferentLength(arr1,arr2);
        }else {
            return checkDifferentLength(arr2,arr1);
        }
    }

    private static boolean checkSameLength(char[] arr1, char[] arr2) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * arr1 固定传长的
     * @param arr1
     * @param arr2
     * @return
     */
    private static boolean checkDifferentLength(char[] arr1, char[] arr2) {
        int count = 0;
        for (int i = 0,j=0; j < arr2.length; ) {
            if (arr1[i] != arr2[j]) {
                count++;
                if (count > 1) {
                    return false;
                }
                i++;
            }else{
                j++;i++;
            }
        }
        return true;
    }
}
