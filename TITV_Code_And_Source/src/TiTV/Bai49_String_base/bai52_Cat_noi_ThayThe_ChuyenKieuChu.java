package TiTV.Bai49_String_base;

import java.util.Locale;

public class bai52_Cat_noi_ThayThe_ChuyenKieuChu {
    public static void main(String[] args) {
        String s1 = "Xin Chào";
        String s2 = " các bạn";

        System.out.println(s1 + s2);
        System.out.println(s1.concat(s2));
        System.out.println("------");

        // Hàm replace => thay thế
        String s3 = "haha";
        System.out.println(s3.replaceAll("ha","Hello World!"));

        //toLowerCase => chuyển viết thường
        //toUpperCase => chuyển viết hoa

        System.out.println(s1.toLowerCase(Locale.ROOT));
        System.out.println(s1.toUpperCase(Locale.ROOT));

        // hàm trim xóa bỏ những khoảng trắng thừa đầu và cuối chuỗi

        String s4 = "       hello        everybody   i am   vu        ";
        System.out.println(s4.trim());

        // hàm subString => cắt chuỗi con
        String s5 = "Hello World!, Everything is good!";
        System.out.println();
        String s6 = s5.substring(5);
        String s7 = s5.substring(5,20);
        System.out.println(s6);
        System.out.println(s7);

            }
}
