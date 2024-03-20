package inheritance_Polymorphism;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = { super.getX(), super.getY(), this.z };
        return arr;
    }

    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }

    public static void main(String[] args) {
        Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p3);
    }
}
