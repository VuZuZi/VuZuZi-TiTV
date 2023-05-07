package TITV_learning.Code.Bai44_Lop_phuong_thuc_triu_tuong_Abstract.test;


import TITV_learning.Code.Bai44_Lop_phuong_thuc_triu_tuong_Abstract.*;

public class Test {
    public static void main(String[] args) {
        ToaDo toaDo1 = new ToaDo(5,2);
        ToaDo toaDo2 = new ToaDo(4,3);
        ToaDo toaDo3 = new ToaDo(3,4);
        ToaDo toaDo4 = new ToaDo(2,5);

//        Hinh h = new Hinh(toaDo1) lỗi vì lớp abttract không thể khởi tạo đối tượng

        Hinh h1 = new Diem(toaDo1);
        Hinh h2 = new HinhChuNhat(toaDo2,6.5,5);
        Hinh h3 = new Circle(toaDo3,4.2);

        System.out.println(h2.tinhDienTich());
    }
}
