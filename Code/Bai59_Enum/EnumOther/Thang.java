package TITV_learning.Code.Bai59_Enum.EnumOther;

public enum Thang {
    tháng_1(31),
    tháng_2(29),
    tháng_3(31),
    tháng_4(30),
    tháng_5(31),
    tháng_6(30),
    tháng_7(31),
    tháng_8(31),
    tháng_9(30),
    tháng_10(31),
    tháng_11(30),
    tháng_12(31);

    private final int soNgay;
    Thang(int soNgay){
        this.soNgay = soNgay;
    }

    public int soNgay(){
        return this.soNgay;
    }
}
