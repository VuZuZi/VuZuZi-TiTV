package TiTV.Bai57_TaiXiu.Loi;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        TaiXiu taiXiu = new TaiXiu();
        int cuoc;
        Scanner scanner = new Scanner(System.in);
        String taiKhoan = "admin";
        String matKhau = "admin";
        int monney = 0;
        String taiKhoanInput;
        String matKhauInput;
        boolean check1,check2;
        do {
            System.out.println("*** Đăng Nhập ***");
            System.out.print("tài khoản: ");
             taiKhoanInput = scanner.nextLine();
            System.out.print("mật khẩu: ");
             matKhauInput = scanner.nextLine();
             check1 = taiKhoan.regionMatches(0,taiKhoanInput,0,taiKhoan.length());
             check2 = matKhau.regionMatches(0,matKhauInput,0,matKhau.length());
            if (check1==false || check2 == false){
                System.out.println("tài khoản hoặc mật khẩu không hợp lệ");
                System.out.println("xin mời nhập lại");
            }
        }while (check1==false || check2 == false);
        System.out.print("Nhập số tiền của bạn vào($): ");
        monney = Integer.parseInt(scanner.nextLine());
        System.out.println("tài khoản của bạn có: $"+monney);
        do {
            System.out.println("Xỉu 3-10 ** Tài 11-18");
            System.out.println("1: Cược Xỉu\n" +
                    "2: Cược Tài");
            System.out.print("nhập lựa chọn của bạn: ");
            int chose = Integer.parseInt(scanner.nextLine());
            if (chose == 1){
                do {
                    System.out.print("Nhập số tiền cược cho cửa XỈU: ");
                    cuoc = Integer.parseInt(scanner.nextLine());
                    if (cuoc>monney){
                        System.out.println("Số tiền cược nhiều hơn tiền của bạn");
                        System.out.println("Xin mời nhập lại");
                    }
                }while (cuoc>monney);
            }
            else if (chose==2){
                do {
                    System.out.print("Nhập số tiền cược cho cửa TÀI: ");
                    cuoc = Integer.parseInt(scanner.nextLine());
                    if (cuoc>monney){
                        System.out.println("Số tiền cược nhiều hơn tiền của bạn");
                        System.out.println("Xin mời nhập lại");
                    }
                }while (cuoc>monney);
            }

        }while (check1);
    }
}
