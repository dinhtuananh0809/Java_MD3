package inheritance_Polymorphism;

import java.util.Scanner;

public class Shape extends Triangle{

    public Shape(double canhA, double canhB, double canhC) {
        super(canhA, canhB, canhC);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap canh A: ");
        double canhA = scanner.nextDouble();
        System.out.println("Moi ban nhap canh B: ");
        double canhB = scanner.nextDouble();
        System.out.println("Moi ban nhap canh C: ");
        double canhC = scanner.nextDouble();
        double calculateArea = 0;
        double calculatePerimeter = 0;
        double s = (canhA + canhB + canhC) / 2;
        if (canhA + canhB > canhC && canhA + canhC > canhB && canhB + canhC > canhA) {
           calculateArea = Math.sqrt(s * (s - canhA) * (s - canhB) * (s - canhC));
           calculatePerimeter = canhA + canhB + canhC;
        } else {
            System.out.println("Day khong phai la 3 canh cua 1 tam giac");
        }

        triangle.setCanhA(canhA);
        triangle.setCanhB(canhB);
        triangle.setCanhC(canhC);
        triangle.setGetArea(calculateArea);
        triangle.setGetPerimeter(calculatePerimeter);

        System.out.println(triangle.toString());
    }



}