package TiTV.Bai61ArrayList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int op = 0;
        do {
            System.out.println("---MENU---\n" +
                    "1: Thêm sinh viên vào danh sách\n" +
                    "2: Kiểm tra danh sách có rỗng hay không\n" +
                    "3: Lấy ra số lượng sinh viên có trong danh sách\n" +
                    "4: làm rỗng danh sách sinh viên\n" +
                    "5: Xóa 1 sinh viên ra khỏi danh sách trên mã sinh viên\n" +
                    "6: Tìm kiếm sinh viên theo tên\n" +
                    "7: Sắp xếp danh sách theo điểm cao -> thâp\n" +
                    "8: Check Student ID");
            System.out.print("Input your option: ");
            try {
                op = Integer.parseInt(sc.nextLine());
                System.out.println();
                switch (op){
                    case 1:
                        System.out.print("Input Student ID: ");String id = sc.nextLine();
                        System.out.println();
                        System.out.print("Input FullName Student: ");
                        String name = sc.nextLine();
                        System.out.println();
                        System.out.print("Input Yearold: ");
                        int year = Integer.parseInt(sc.nextLine());
                        System.out.println();
                        System.out.print("Input score: ");
                        float score = sc.nextFloat();
                        System.out.println();
                        SinhVien sv = new SinhVien(id,name,year,score);
                        dssv.addStudent(sv);
                        break;
            }}catch (Exception e){
                System.out.println(e);
            }


            
//                    System.out.println("Nhập mã sinh viên: "); String maSinhVien = sc.nextLine();
//                    System.out.println("Nhập họ và tên: "); String hoVaTen = sc.nextLine();
//                    System.out.println("Nhập năm sinh: "); int namSinh = sc.nextInt();
//                    System.out.println("Nhập điểm trung bình: "); float diemTrungBinh = sc.nextFloat();
//                    SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
//                    dssv.addStudent(sv);
//                sc.nextLine();
            
        }while (8 > op ||op>0);
    }
}
