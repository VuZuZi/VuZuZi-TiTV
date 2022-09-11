package TiTV.Bai57_TaiXiu;

import java.util.Scanner;

public class DangNhap {
    private String taiKhoan = "admin";
    private String matKhau = "admin";

    public DangNhap(String taiKhoan, String matKhau) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void checkTaiKhoan(String tk, String mk) {
        Scanner scanner = new Scanner(System.in);
        boolean check1 = false, check2 = false;
        do {
            System.out.println("*** Đăng Nhập ***");
            System.out.print("tài khoản: ");
            tk = scanner.nextLine();
            System.out.print("mật khẩu: ");
            mk = scanner.nextLine();
            check1 = taiKhoan.regionMatches(0, tk, 0, taiKhoan.length());
            check2 = matKhau.regionMatches(0, mk, 0, matKhau.length());
            if (check1 == false || check2 == false) {
                System.out.println("tài khoản hoặc mật khẩu không hợp lệ");
                System.out.println("xin mời nhập lại");
            }
        } while (check1 == false || check2 == false);
    }
}
