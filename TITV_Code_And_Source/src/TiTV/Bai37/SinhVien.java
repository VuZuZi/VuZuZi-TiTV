package TiTV.Bai37;

import java.util.Objects;

public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private Date ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien(String maSinhVien, String hoVaTen, Date ngaySinh, double diemTrungBinh, Lop lop) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String LayTenKhoa() {
        return this.lop.getTenKhoa();
    }

    public boolean KiemTraThiDat() {
        if (this.diemTrungBinh >= 5){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SinhVien sinhVien = (SinhVien) o;
        return ngaySinh.equals(sinhVien.ngaySinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ngaySinh);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", diemTrungBinh=" + diemTrungBinh +
                ", lop=" + lop +
                '}';
    }
}
