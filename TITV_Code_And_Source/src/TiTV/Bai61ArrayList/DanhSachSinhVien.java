package TiTV.Bai61ArrayList;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }
    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>(); // khai báo 1 arrayList
    }
    public void addStudent(SinhVien sv){
        this.danhSach.add(sv);
    }

    @Override
    public String toString() {
        return "DanhSachSinhVien{" +
                "danhSach=" + danhSach +
                '}';
    }
}
