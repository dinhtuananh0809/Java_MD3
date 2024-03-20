package inheritance_Polymorphism;

public class Triangle {

    private double canhA;
    private double canhB;
    private double canhC;
    private double getArea;
    private double getPerimeter;

    public Triangle(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
        this.getArea = getArea;
        this.getPerimeter = getPerimeter;
    }

    public Triangle() {

    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }

    public double getGetArea() {
        return getArea;
    }

    public void setGetArea(double getArea) {
        this.getArea = getArea;
    }

    public double getGetPerimeter() {
        return getPerimeter;
    }

    public void setGetPerimeter(double getPerimeter) {
        this.getPerimeter = getPerimeter;
    }


    public String toString() {
        return "(" + "Gia tri canh A la: " + canhA + "\n" + "Gia tri canh B la: " + canhB + "\n" + "Gia tri canh C la: " + canhC + "\n" +
                "Chu vi hinh tam giac la: " + getPerimeter + "\n" + "Dien tich hinh tam giac la: " + getArea  + ")";
    }
}
