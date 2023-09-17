package interview;

public class Interview0109 {
    public boolean isFlipedString(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if(s2.isEmpty()){
            return false;
        }
        s1 = s1 + s1;
        return s1.contains(s2);
    }
}
