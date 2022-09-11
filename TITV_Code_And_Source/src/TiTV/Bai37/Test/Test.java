package TiTV.Bai37.Test;

import TiTV.Bai37.Date;
import TiTV.Bai37.Lop;
import TiTV.Bai37.SinhVien;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(10,3,2001);
        Date date1 = new Date(26,5,2000);

        Lop lop1 = new Lop("A6","K58");
        Lop lop2 = new Lop("A1","K56");

        SinhVien sinhVien1 = new SinhVien("17B02","Đoàn Đình Vũ",date,6.6,lop1);
        SinhVien sinhVien2 = new SinhVien("Se14B06","Nguyễn Văn A",date,4.6,lop2);
        SinhVien sinhVien3 = new SinhVien("SE17b06","Nguyễn Văn B",date1,6.5,lop1);

        System.out.println(sinhVien1.toString());
        System.out.println(sinhVien2.toString());
        System.out.println(sinhVien3.toString());

        System.out.println(sinhVien1.LayTenKhoa());
        System.out.println(sinhVien2.LayTenKhoa());
        System.out.println(sinhVien3.LayTenKhoa());

        System.out.println(sinhVien1.KiemTraThiDat());
        System.out.println(sinhVien2.KiemTraThiDat());
        System.out.println(sinhVien3.KiemTraThiDat());

        System.out.println(sinhVien1.equals(sinhVien2));
        System.out.println(sinhVien1.equals(sinhVien3));
        System.out.println(sinhVien2.equals(sinhVien3));



    }
}
