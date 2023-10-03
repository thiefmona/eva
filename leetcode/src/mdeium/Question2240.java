package mdeium;

public class Question2240 {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int count = 0;
        int maxPen = total / cost1;
        for (int i = 0; i <= maxPen; i++) {
           count+=(total-cost1*i)/cost2+1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Question2240().waysToBuyPensPencils(20,10,5));
        System.out.println(11111);
    }
}
