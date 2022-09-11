package TiTV.Bai38;

public class HangSanXuat {
    private String tenHangSanXuat;
    private Country country;

    public HangSanXuat(String tenHangSanXuat, Country country) {
        this.tenHangSanXuat = tenHangSanXuat;
        this.country = country;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
