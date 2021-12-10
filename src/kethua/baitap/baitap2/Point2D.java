package kethua.baitap.baitap2;

public class Point2D {
    private float X = 0.0f;
    private float Y = 0.0f;

    public Point2D(){}

    public Point2D(float x, float y) {
        X = x;
        Y = y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }

    public void setX(float x) {
        X = x;
    }

    public void setY(float y) {
        Y = y;
    }
    public void setXY(float x , float y){
        this.X = x;
        this.Y = y;
    }

    public  float[]  getXY(){
        float[] test = new float[2];
        test[0] = this.X;
        test[1] = this.Y;
        return test;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
