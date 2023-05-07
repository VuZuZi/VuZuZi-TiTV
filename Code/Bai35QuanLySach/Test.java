package TITV_learning.Code.Bai35QuanLySach;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(10,3,2001);
        Date date1 = new Date(1,1,2000);
        Date date2 = new Date(20,5,2022);

        TacGia tacGia = new TacGia("Đoàn Đình Vũ",date);
        TacGia tacGia1 = new TacGia("Nguyễn Văn A",date1);
        TacGia tacGia2 = new TacGia("Nguyễn Văn B",date2);

        Book book = new Book("Xây Dựng Thế Giới",5000,2001,tacGia);
        Book book1 = new Book("Đập Bỏ Thế Giới",500,2002,tacGia1);
        Book book2 = new Book("Vực Dậy Thế Giưới",1000,2001,tacGia2);


        System.out.println(book.getNameBook());
        book.printNameBook();

        System.out.println("so sánh năm sx của book và book2");
        System.out.println(book.checkForYear(book2));
        System.out.println("so sánh năm sx của book và book1");
        System.out.println(book.checkForYear(book1));

        System.out.println("book2 sell 30% ");
        System.out.println(book2.getPrice());
        System.out.println("new price");
        System.out.println(book2.priceSell(30));

    }
}
