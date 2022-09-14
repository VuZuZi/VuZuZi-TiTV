package TiTV.Bai73_CachLuuDoiTuongVaoTapTin;

import TiTV.Bai73_CachLuuDoiTuongVaoTapTin.ArrayListStudents.Students;

import java.io.*;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {

        // 1. lưu 1 sv vào note
        try {
            File file = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai73_CachLuuDoiTuongVaoTapTin//luu.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            Students st1 = new Students("001","Nguyễn Văn A",2000, 5.5F);
            oos.writeObject(st1);
            oos.flush();
            oos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
