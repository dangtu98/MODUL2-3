package kethua.baitap;

public class Cylinder extends Circle2 {
    private double height = 2;

    public  Cylinder(){}

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double Volumes(){
        return Math.PI * this.height * this.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height
                +"Volumes" + Volumes() +
                '}';
    }
}
