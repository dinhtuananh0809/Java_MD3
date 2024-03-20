package inheritance_Polymorphism;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void  setXY( float X, float Y){
        this.x = X;
        this.y = Y;
    }

    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }

    public  String toString (){
        return "(" + this.x + "" + this.y + ")";
    }
}
