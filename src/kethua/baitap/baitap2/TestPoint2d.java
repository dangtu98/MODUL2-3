package kethua.baitap.baitap2;

import java.util.Arrays;

public class TestPoint2d {
    public static void main(String[] args) {
        Point2D testPoint2d_1 = new Point2D(2,5);
        System.out.println(testPoint2d_1);

        testPoint2d_1 = new Point2D(5,3);
        System.out.println(testPoint2d_1);

        System.out.println(Arrays.toString(testPoint2d_1.getXY()));
    }
}
