package inheritance_Polymorphism;

import java.util.Scanner;

public class Cylinder extends Ex1 {
   Circle circle;
   int height;

   public Cylinder(String color, int radius, int height) {
      this.circle = new Circle(radius, color);
      this.height = height;
   }

   public double calculateVolume() {
      return Math.PI * Math.pow(circle.getRadius(), 2) * height;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Mời bạn nhập bán kính");
      int radius = scanner.nextInt();
      System.out.println("Mời bạn nhập chiều cao");
      int height = scanner.nextInt();
      Cylinder cylinder = new Cylinder("red", radius, height);
      double volume = cylinder.calculateVolume();
      System.out.println("Thể tích của hình trụ là: " + volume);
   }
}