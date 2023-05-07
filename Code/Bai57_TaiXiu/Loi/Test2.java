package TITV_learning.Code.Bai57_TaiXiu.Loi;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 100;
        int cuoc = 0;
        String taiKhoan = "admin", matKhau = "admin", tk, mk;


        boolean checkTienCuoc = true;
        int tienCuoc = 0;
        do {
            System.out.println("Tiền của bạn: "+money);
            System.out.print("Nhập tiền cược: ");
            String tienCuocString = scanner.nextLine();
            for (int i = 0; i < tienCuocString.length(); i++) {
                if (tienCuocString.charAt(i) >= '0' && tienCuocString.charAt(i) <= '9') {
                    checkTienCuoc = true;
                    tienCuoc = Integer.parseInt(tienCuocString);
                }else {
                    System.out.println("số tiền cược nhập vào không hợp lệ");
                    System.out.println("vui lòng nhập lại");
                    checkTienCuoc = false;
                    break;
                }
            }
            if (tienCuoc > money) {
                System.out.println("tài khoản của bạn " + money + " < tiền cược");
                System.out.println("vui lòng nhập lại");
                checkTienCuoc = false;
            }
        }
            while (checkTienCuoc == false) ;


//        String luachon;
//        boolean checkLuaChon = false;
//        do {
//            System.out.print("nhập lựa chọn của bạn: ");
//            luachon = scanner.nextLine();
//            for (int i = 0; i < luachon.length(); i++) {
//                if (luachon.charAt(i) >= '0' && luachon.charAt(i) <= '3'){
//                    checkLuaChon = true;
//                }else {
//                    System.out.println("lựa chọn của bạn không hợp lệ");
//                    checkLuaChon = false;
//                    break;
//                }
//            }
//        } while (checkLuaChon == false);


        }
    }

