package TITV_learning.Code.Bai64CauTrucSet;

import java.util.*;

public class RutThamTrungThuong_TreeSet { // treeset lưu giá trị theo thứ tự

        Set<String> thungChuaPhieuDuThuong = new HashSet<String>();

        public RutThamTrungThuong_TreeSet() {
        }

        public boolean themPhieuDuThuong(String giaTri) {
            return this.thungChuaPhieuDuThuong.add(giaTri);
        }

        public boolean xoaPhieuDuThuong(String giaTri) {
            return this.thungChuaPhieuDuThuong.remove(giaTri);
        }

        public boolean kiemTraPhieuDuThuong(String giaTri) {
            return this.thungChuaPhieuDuThuong.contains(giaTri);
        }

        public void xoaTatCaPhieuDuThuong() {
            this.thungChuaPhieuDuThuong.clear();
        }

        public int laySoLuongPhieuDuThuong() {
            return this.thungChuaPhieuDuThuong.size();
        }

        public String rutThamTrungThuong() {
            String ketQua = "";
            Random random = new Random();
            int viTri = random.nextInt(this.thungChuaPhieuDuThuong.size());
            return (String) this.thungChuaPhieuDuThuong.toArray()[viTri];
        }

        public void inTatCaCacPhieu() {
            System.out.println(Arrays.toString(this.thungChuaPhieuDuThuong.toArray()));
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            RutThamTrungThuong_HashSet rutTham = new RutThamTrungThuong_HashSet();            // và giữ lại 1
            int luaChon = 0;
            do {
                System.out.println("--------------");
                System.out.println("***MENU***");
                System.out.println("1: Thêm mã số dự thưởng");
                System.out.println("2: Xóa mã số dự thưởng");
                System.out.println("3: Kiểm tra mã số dự thưởng có tồn tại hay không?");
                System.out.println("4: Xóa tất cả các phiếu dự thưởng");
                System.out.println("5: Số lượng phiếu dự thưởng");
                System.out.println("6: Rút thăm trúng thưởng.");
                System.out.println("7: In ra tất cả các phiếu dự thưởng");
                System.out.println("0: Thoát khỏi chương trình");
                System.out.print("lựa chọn của ban: ");
                luaChon = Integer.parseInt(scanner.nextLine());
                if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
                    System.out.print("nhập vào mã số dự thưởng: ");
                    String giaTri = scanner.nextLine();
                    if (luaChon == 1) {
                        rutTham.themPhieuDuThuong(giaTri);
                    } else if (luaChon == 2) {
                        rutTham.xoaPhieuDuThuong(giaTri);
                    } else {
                        System.out.println("Kết quả kiểm tra: " + rutTham.kiemTraPhieuDuThuong(giaTri));
                    }
                } else if ((luaChon == 4)) {
                    rutTham.xoaTatCaPhieuDuThuong();
                } else if (luaChon == 5) {
                    System.out.println("Số lượng phiếu là: " + rutTham.laySoLuongPhieuDuThuong());
                } else if (luaChon == 6) {
                    System.out.println("Phiếu trúng thưởng: " + rutTham.rutThamTrungThuong());
                } else if (luaChon == 7) {
                    System.out.println("Các mã phiếu dự thưởng: ");
                    rutTham.inTatCaCacPhieu();
                }
            } while (luaChon != 0);
        }

    }
