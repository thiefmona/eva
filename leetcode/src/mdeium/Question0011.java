package mdeium;

public class Question0011 {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int area = 0;
        while (l < r) {
            area=height[l]<height[r]? Math.max(area, (r - l) *height[l++])
                    :Math.max(area, (r - l) *height[r--]);
        }
        return area;
    }

    public static void main(String[] args) {
        int i=3;
        System.out.println(i++);
    }
}
