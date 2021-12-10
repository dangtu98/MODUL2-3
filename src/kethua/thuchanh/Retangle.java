package kethua.thuchanh;

public class Retangle extends Shape {
    double width;
    double length;


    public Retangle(){};

    public Retangle(double width, double height) {
        this.width = width;
        this.length = height;
    }

    public Retangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}
