package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
//    String paragraph = "A regular expression is a sequence of characters that forms a search pattern";
////        // Thay Thế tu "expression" bang tu "bieu thuc"
//            paragraph.replace("expression","bieu thuc");
//
////        // in ra do dai chuoi
//            System.out.println(paragraph.length());
////        // dao nguoc chuoi da cho
//          StringBuilder str = new StringBuilder(paragraph);
//          str.reverse();
//          System.out.printf("%s\n", str);
////        // xoa ky tu dau tien cua chuoi
//            StringBuilder str2 = new StringBuilder(paragraph);
//            str2.deleteCharAt(0);
//            System.out.printf("String2: %s",str2);
////        // tach chuoi da cho thanh mang cac tu
//            paragraph.split()
////        //thay the ky tu tai vi tri thu 15 bang ky tu 'H'

        String contentToCheck = """
                A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.
                A regular expression can be a single character, or a more complicated pattern.
                """;
        // Kiểm tra trong chuỗi có xuất hiện chữ Java hay không
        boolean isContain = contentToCheck.contains("Java");
        ;

        System.out.println(String.format("Chuoi nay %s tu Java", isContain ? "co" : "khong"));
        //Kiểm tra chuỗi co xuat hien ky tu 'a' hay khong,
        //khong phan biet hoa thuong


        System.out.printf("Chuoi nay %s xuat hien ki tu a \n",
                Pattern.compile("[aA]").matcher(contentToCheck).find() ?
                        "co" : "khong");
        //Dem so lan xuat hien cua ky tu u
        byte count = 0;
        Pattern pattern = Pattern.compile("u");
        Matcher matcher = pattern.matcher(contentToCheck);
        while (matcher.find()) {
            count++;
        }
        System.out.printf("Chuoi nay co %d ki tu \"u\" \n", count);

        //Dem so lan xuat hien cua tu "regular"

        byte count2 = 0;
        Pattern pattern1 = Pattern.compile("regular");
        Matcher matcher1 = pattern1.matcher(contentToCheck);
        while (matcher1.find()) {
            count2++;

        }
        System.out.printf("Chuoi nay co %d chu \"regular\"\n", count2);
    }
}

