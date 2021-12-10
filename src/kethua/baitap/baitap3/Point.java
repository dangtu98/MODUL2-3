package kethua.baitap.baitap3;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point(){}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

   public void setXY(float x , float y){
        this.x = x;
        this.y = y;
   }
   public float[] getXY(){
        float[] tests = new float[2];
        tests[0] = x;
        tests[1] = y;
        return tests;
   }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
