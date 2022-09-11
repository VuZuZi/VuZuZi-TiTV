package TiTV.Bai49_String_base;

import java.util.Scanner;

public class p1_lengthAndCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Nhập vào chuỗi: ");
        s = scanner.nextLine();
        System.out.println("---------------");

        //hàm length()
        System.out.println("độ dài chuỗi truyền vào: " + s.length());

        //hàm charAt(vị trí)    => lấy ra 1 kí tự tại vị trí
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Vị trí thứ " + i + " trong chuỗi = ký tự " + s.charAt(i));
        }

        // hàm getChars(vị trí bắt đầu, vị trí kết thúc(không tính vị trí này khi lưu vào mảng), mảng lưu dữ liệu,
        // vị trí bắt đầu lưu của mảng)
//        char[] arrayChar = new char[10]; // khai báo mảng char có thể chứa 100 ký tự
//
//        s.getChars(2, 5, arrayChar, 2);
//        for (int i = 0; i < arrayChar.length; i++) {
//            System.out.println("Giá trị của mảng tại " + i +" là: "+arrayChar[i]);
//
//
//        }

        byte[] arrayByte = s.getBytes();
        for (int i = 0; i < arrayByte.length; i++)
            System.out.println("ký tự thứ " + i +" Ký tự "+ s.charAt(i) + " = " + arrayByte[i]);
    }
}
