package String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        int number;
        while (true) {
            System.out.println("Menu");
            System.out.println("1.Nhap thong tin san pham");
            System.out.println("2.Hien thi thong tin san pham");
            System.out.println("3. Tinh loi nhuan san pham");
            System.out.println("4. Sap xep san pham theo loi nhuan giam dan");
            System.out.println("5. Thong ke cac san pham theo gia");
            System.out.println("6. Thong ke cac san pham theo ten san pham");
            System.out.println("7. Ban san pham");
            System.out.println("8. Cap nhat trang thai san pham");
            System.out.println("9. Thoat");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    productManager.addProduct(scanner);
                    break;
                case 2:
                    productManager.displayData();
                    break;
                case 3:
                    productManager.calProfit();
                    break;
                case 4:

                case 5:
                    productManager.statisticalByPrice(scanner);
                    break;
                case 6:
                    productManager.findProductByName(scanner);
                    break;
                case 7:
                    productManager.sellProduct(scanner);
                    break;
                case 8:
                    productManager.productStatus(scanner);
                    break;
                case 9:
                    return;
                default:
                    System.out.println("So ban nhap khong hop le");
            }
        }
    }
}
