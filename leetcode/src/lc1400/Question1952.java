package lc1400;

public class Question1952 {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            count += n % i == 0 ? 1 : 0;
            if(count>2){
                return false;
            }
        }
        return count==2;
    }

    public static void main(String[] args) {
        System.out.println(new Question1952().isThree(4));
    }
}
