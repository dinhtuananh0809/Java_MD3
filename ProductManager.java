package String;

import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProductManager {
    private Product[] productArr = new Product[0];


    public Product inputData(Scanner scanner) {
        System.out.println("Nhap ma san pham");
        String productId = getInputFromUser(scanner, "P\\w{3}");
        System.out.println("Nhap ten san pham");
        String productName = getInputFromUser(scanner, "\\w{6,50}");
        System.out.println("Nhap gia san pham");
        float importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap gia xuat cua san pham");
        float exportPrice = Float.parseFloat(getInputFromUser(scanner, "^[0-9]*\\.?[0-9]+$"));
        System.out.println("Nhap so luong san pham");
        int quantity = Integer.parseInt(getInputFromUser(scanner, "[1-9][0-9]*$"));
        System.out.println("Nhap mo ta san pham");
        String descriptions = scanner.nextLine();
        System.out.println("Nhap trang thai san pham(True/False)");
        boolean status = Boolean.parseBoolean(scanner.nextLine());

        return new Product(productId, productName, importPrice, exportPrice, importPrice - exportPrice, quantity, descriptions, status);
    }


    public void addProduct(Scanner scanner) {
        System.out.println("Nhap so luong san pham can nhap");
        short number = scanner.nextShort();
        short productLength = (short) productArr.length;
        Product[] newProductArr = new Product[number + productLength];
        byte currentIndex = 0;
        for (byte i = 0; i < productLength; i++) {
            newProductArr[i] = productArr[i];
            currentIndex++;
        }

        for (byte i = 0; i < number; i++) {
            newProductArr[currentIndex] = inputData(scanner);
            currentIndex++;
        }

        productArr = newProductArr;
    }


    private String getInputFromUser(Scanner scanner, String regex) {
        String data = scanner.nextLine();
        boolean isValidate = validate(regex, data);
        if (isValidate) {
            return data;
        } else {
            System.out.println("Du lieu ban nhap khong hop le,vui long nhap lai");
            return getInputFromUser(scanner, regex);
        }
    }

    private boolean validate(String regex, String input) {
        //dung regex de validate
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private Boolean inputStatusFromUser(String regex,Scanner scanner){
        while (true){
            String data = scanner.nextLine();
            boolean isValid = validate(regex, data);
            if (isValid){
                return Boolean.parseBoolean(data);
            }
            System.out.println("Dinh dang khong dung, moi nhap lai");
        }
    }

    public void displayData() {
        for (Product product : productArr) {
            System.out.println(product.toString());
        }
    }

    public int calProfit() {
        int totalProfit = 0;
        for (Product product : productArr) {
            totalProfit += (int) ((product.getExportPrice() - product.getImportPrice()));
        }
        return totalProfit;
    }

    public void statisticalByPrice(Scanner scanner) {
        System.out.println("input from Price");
        float fromPrice = Float.parseFloat(getInputFromUser(scanner, "\\d*"));
        System.out.println("input to Price");
        float toPrice = Float.parseFloat(getInputFromUser(scanner, "\\d*"));

        byte count = 0;
        for (Product product : productArr) {
            if (product.getImportPrice() > fromPrice && product.getImportPrice() < toPrice) {
                count++;

            } else {
                System.out.println("Gia san pham ngoai pham vi ban tim kiem");
            }

            System.out.printf("Tong cong co %d san pham", count);
        }


    }

    public void findProductByName(Scanner scanner) {
        System.out.println("Nhap ten san pham ban muon tim");
        String productName = getInputFromUser(scanner, "\\w{6,50}");

        for (Product product : productArr) {
            if (product.getProductName().equals(productName)) {
                System.out.println(product.toString());
            }
        }
    }

    public void sellProduct(Scanner scanner) {
        System.out.println("Them ma san pham ban muon ban");
        String productId = getInputFromUser(scanner, "P\\w{3}");

        for (Product product : productArr) {
            if (product.getProductId().equals(productId)) {
                System.out.println("Ban muon ban bao nhieu san pham");
                int quantity = Integer.parseInt(scanner.nextLine());

                if (product.getQuantity() - quantity < 0) {
                    System.out.println("so luong ban nhap dang lon hon trong kho, vui long nhap lai");
                    return;
                }
            }
        }
    }


    public void productStatus(Scanner scanner){
        System.out.println("Moi ban nhap ma san pham");
        String productId = getInputFromUser(scanner,"P\\w{3}");

        for (Product product : productArr){
            if (product.getProductId().equals(productId)){
                System.out.println("Tinh trang san pham dung/sai: ");
                Boolean status = inputStatusFromUser("(true|false)", scanner);

                product.setStatus(status);
            }
        }
    }



}
