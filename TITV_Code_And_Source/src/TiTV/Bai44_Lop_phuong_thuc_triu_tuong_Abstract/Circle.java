package TiTV.Bai44_Lop_phuong_thuc_triu_tuong_Abstract;

public class Circle extends Hinh{
    private double r;


    public Circle(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return this.getR()*this.getR()*Math.PI;
    }
}
