package TiTV.Bai45_Abtract_p2.Phuong_Tien;

import TiTV.Bai45_Abtract_p2.HangSanXuat;
import TiTV.Bai45_Abtract_p2.PhuongTienDiChuyen;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto(String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("Oto",hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
