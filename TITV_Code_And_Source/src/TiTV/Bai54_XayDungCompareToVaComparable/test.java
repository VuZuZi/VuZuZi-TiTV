package TiTV.Bai54_XayDungCompareToVaComparable;

public class test {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien(1,"Nguyễn Văn A","A",8.8);
        SinhVien sinhVien1 = new SinhVien(3,"Nguyễn Văn B","A",8);
        SinhVien sinhVien2 = new SinhVien(10,"Nguyễn Văn C","A",10);

        System.out.println(sinhVien.compareTo(sinhVien1));
    }
}
