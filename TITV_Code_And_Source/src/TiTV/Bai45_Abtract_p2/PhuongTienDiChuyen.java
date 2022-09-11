package TiTV.Bai45_Abtract_p2;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien,HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }



    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }

    public void batDau(){
        System.out.println(this.getTenLoaiPhuongTien()+" bắt đầu di chuyển");
    }

    public void tangToc(){
        System.out.println(this.getTenLoaiPhuongTien()+" đang tăng tốc");
    }

    public void dungLai(){
        System.out.println(this.getTenLoaiPhuongTien()+" đà dừng lại");
    }

    public abstract double layVanToc();
}
