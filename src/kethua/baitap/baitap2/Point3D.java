package kethua.baitap.baitap2;

public class Point3D extends  Point2D {
    private float Z = 0.0f;


    public Point3D(){};
    public Point3D(float z) {
        Z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        Z = z;
    }

    public float getZ() {
        return Z;
    }

    public void setZ(float z) {
        Z = z;
    }
    public  void XYZ(float x , float y , float z ){
        this.Z = z;
    }
    public float[] getXYZ(){
        float[] test = new float[3];
        test[2] = this.Z;
        return test;
    }

    @Override
    public String toString() {
        return "Point3D { " + super.toString() +
                "Z=" + Z + "}";

    }
}
