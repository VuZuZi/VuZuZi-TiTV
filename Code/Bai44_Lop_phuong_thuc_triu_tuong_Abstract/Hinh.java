package TITV_learning.Code.Bai44_Lop_phuong_thuc_triu_tuong_Abstract;

public abstract class Hinh {
    private ToaDo toaDo;

    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public abstract double tinhDienTich();
}
