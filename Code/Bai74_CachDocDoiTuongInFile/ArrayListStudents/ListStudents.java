package TITV_learning.Code.Bai74_CachDocDoiTuongInFile.ArrayListStudents;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudents {
    private ArrayList<Students> studentsArrayList;

    public ListStudents() {
        this.studentsArrayList = new ArrayList<Students>();
    }

    public ListStudents(ArrayList<Students> danhSach) {
        this.studentsArrayList = danhSach;
    }

    // 1.	Thêm sinh viên vào danh sách.
    public void themSinhVien(Students sv) {
        this.studentsArrayList.add(sv);
    }

    //		2.	In danh sách sinh viên ra màn hình.
    public void inDanhSachSinhVien() {
        for (Students sinhVien : studentsArrayList) {
            System.out.println(sinhVien);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.studentsArrayList.isEmpty();
    }

    //		4.	Lấy ra số lượng sinh viên trong danh sách.
    public int laySoLuongSinhVien() {
        return this.studentsArrayList.size();
    }

    //		5.	Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach() {
        this.studentsArrayList.removeAll(studentsArrayList);
    }

    //		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean kiemTraTonTai(Students sv) {
        return this.studentsArrayList.contains(sv);
    }

    //		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoaSinhVien(Students sv) {
        return this.studentsArrayList.remove(sv);
    }

    //		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (Students sinhVien : studentsArrayList) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    //		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.studentsArrayList, new Comparator<Students>() {
            @Override
            public int compare(Students sv1, Students sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
    // 10. ghi xuống file
    public void GhiDuLieuXuongFile(File file){
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            for (Students students: studentsArrayList
                 ) {
                oos.writeObject(students);
            }

            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void DocDuLieuTuFile(File file) {
        try {
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            // đọc arraylist các đối tượng từ file

//            var resultList = ois.readObject();

//
//            Students st = null;
//            while (true){
//                Object oj = ois.readObject();
//                if (st == null){
//                    break;
//                }
//                if (st != null){
//                    st = (Students) oj;
//                    this.studentsArrayList.add(st);
//                }
//
//            }
//
//            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
