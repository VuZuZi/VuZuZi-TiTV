package TITV_learning.Code.Bai36QuanLyBoPhim;

public class BoPhim {
    private String nameFilm;
    private int yearSX;
    private HangSX hangSX;
    private double price;
    private Date ngayChieu;

    public BoPhim(String nameFilm, int yearSX, HangSX hangSX, double price, Date ngayChieu) {
        this.nameFilm = nameFilm;
        this.yearSX = yearSX;
        this.hangSX = hangSX;
        this.price = price;
        this.ngayChieu = ngayChieu;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public int getYearSX() {
        return yearSX;
    }

    public void setYearSX(int yearSX) {
        this.yearSX = yearSX;
    }

    public HangSX getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSX hangSX) {
        this.hangSX = hangSX;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVeReHon(BoPhim phimkhac){
        if (this.getPrice()>=phimkhac.getPrice()){
            return false;
        }else return true;
    }

    public String tenHangSanXuatPhim(){
        return hangSX.getTenHangSanXuat();
    }

    public double giaSaukhuyenMai(double percentage){
        return this.price*(1-percentage/100);
    }
}
