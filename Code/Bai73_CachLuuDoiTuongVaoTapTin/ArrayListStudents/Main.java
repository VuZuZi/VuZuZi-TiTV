package TITV_learning.Code.Bai73_CachLuuDoiTuongVaoTapTin.ArrayListStudents;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListStudents dssv = new ListStudents();
        int luaChon = 0;
        do {
            System.out.println("MENU ---------- ");
            System.out.println("Vui lòng chọn chức năng: ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            +"10.   Lưu danh sách sinh viên vào tập tin. \n"
                            + "0.   Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon==1) {
//				1.	Thêm sinh viên vào danh sách.
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
                System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
                System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
                Students sv = new Students(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            }else if(luaChon==2) {
//				2.	In danh sách sinh viên ra màn hình.
                dssv.inDanhSachSinhVien();

            }else if(luaChon==3) {
//				3.	Kiểm tra danh sách có rỗng hay không.
                System.out.println("Danh sách rỗng: "+ dssv.kiemTraDanhSachRong());
            }else if(luaChon==4) {
//				4.	Lấy ra số lượng sinh viên trong danh sách.
                System.out.println("Số lượng hiện tại: "+ dssv.laySoLuongSinhVien());
            }else if(luaChon==5) {
//				5.	Làm rỗng danh sách sinh viên.
                dssv.lamRongDanhSach();
            }else if(luaChon==6) {
//				6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                Students sv = new Students(maSinhVien);
                System.out.println("Kiếm tra sinh viên có trong danh sách: "+dssv.kiemTraTonTai(sv));
            }else if(luaChon==7) {
//				7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
                Students sv = new Students(maSinhVien);
                System.out.println("Xóa sinh viên trong danh sách: "+dssv.xoaSinhVien(sv));
            }else if(luaChon==8) {
//				8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
                System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
                System.out.println("Kết quả tìm kiếm: ");
                dssv.timSinhVien(hoVaTen);

            }else if(luaChon==9) {
//				9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhVien();
            }else if (luaChon == 10){
                // 10. lưu danh sách sinh viên vào text
//                System.out.print("nhập tên file"); String tenFile = sc.nextLine();
//                File file = new File(tenFile);
                dssv.GhiDuLieuXuongFile();
            }
        }while(luaChon!=0);
    }
}
