package TiTV.Bai36QuanLyBoPhim;

public class HangSX {
    private String tenHangSanXuat;
    private String country;

    public HangSX(String tenHangSanXuat, String country) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.country = country;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
