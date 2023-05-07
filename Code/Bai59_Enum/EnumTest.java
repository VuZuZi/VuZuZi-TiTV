package TITV_learning.Code.Bai59_Enum;


public class EnumTest {
    public static void main(String[] args) {
        ThoiKhoaBieu t2 = new ThoiKhoaBieu(Day.Monday,"Toán Lý Hoa");
        ThoiKhoaBieu t3 = new ThoiKhoaBieu(Day.Tueday,"Văn Sử Địa");
        ThoiKhoaBieu t4 = new ThoiKhoaBieu(Day.Wednessday,"đi chơi");
        ThoiKhoaBieu t5 = new ThoiKhoaBieu(Day.thusday,"nghỉ lễ");
        ThoiKhoaBieu t6 = new ThoiKhoaBieu(Day.Friday,"họp lớp");
        ThoiKhoaBieu t7 = new ThoiKhoaBieu(Day.Saturday,"đi nhậu");
        ThoiKhoaBieu cn = new ThoiKhoaBieu(Day.Sunday,"Nghỉ");


        System.out.println(t3);

//        int x = Thang.tháng_1.soNgay();
//        System.out.println("số ngày của tháng 1:"+x+" ngày");
    }
}
