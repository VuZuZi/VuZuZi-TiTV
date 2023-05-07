package TITV_learning.Code.Bai44_Lop_phuong_thuc_triu_tuong_Abstract;

public class Diem extends Hinh{

    public Diem(ToaDo toaDo) {
        super(toaDo);
    }

    @Override
    public double tinhDienTich() {
        return 1;
    }
}
