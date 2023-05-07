package TITV_learning.Code.Bai36QuanLyBoPhim;

public class Test {
    public static void main(String[] args) {
        HangSX hang1 = new HangSX("Marvel","U.S.A");
        HangSX hang2 = new HangSX("Sony","U.S.A");

        Date date = new Date(30,11,2030);
        Date date1 = new Date(20,5,2020);

        BoPhim phim1 = new BoPhim("Spider Man",2010,hang1,10,date1);
        BoPhim phim2 = new BoPhim("BatMan",2015,hang2,15,date);

        System.out.println(phim1.kiemTraGiaVeReHon(phim2));
        System.out.println(phim2.kiemTraGiaVeReHon(phim1));

        System.out.println(phim1.tenHangSanXuatPhim());
        System.out.println(phim2.tenHangSanXuatPhim());

        System.out.println(phim1.getPrice());
        System.out.println("giảm giá 30%, giá sau khuyến mãi: ");
        System.out.println(phim1.giaSaukhuyenMai(30));
        System.out.println(phim2.getPrice());
        System.out.println("giảm giá 90%, giá sau khuyễn mãi");
        System.out.println(phim2.giaSaukhuyenMai(90));
    }
}
