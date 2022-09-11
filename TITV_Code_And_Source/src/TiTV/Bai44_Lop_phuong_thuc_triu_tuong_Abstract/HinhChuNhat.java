package TiTV.Bai44_Lop_phuong_thuc_triu_tuong_Abstract;

public class HinhChuNhat extends Hinh{
    private double chieuRong;
    private double chieuDai;



    public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuDai) {
        super(toaDo);
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    @Override
    public double tinhDienTich() {
        return chieuRong*chieuDai;
    }
}
