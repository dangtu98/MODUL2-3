package kethua.thuchanh;

public class Circletest {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1();
        System.out.println(circle1);

        circle1 = new Circle1(3.5);
        System.out.println(circle1);

        circle1 = new Circle1("yelow" , false, 3.5);
        System.out.println(circle1);

    }
}
