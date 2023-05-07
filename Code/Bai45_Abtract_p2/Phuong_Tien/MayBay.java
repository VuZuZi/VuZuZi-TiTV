package TITV_learning.Code.Bai45_Abtract_p2.Phuong_Tien;

import TITV_learning.Code.Bai45_Abtract_p2.HangSanXuat;
import TITV_learning.Code.Bai45_Abtract_p2.PhuongTienDiChuyen;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("Máy Bay",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("máy bay đã cất cánh");
    }

    public void haCanh(){
        System.out.println("máy bay hạ cánh .....");
    }
}
