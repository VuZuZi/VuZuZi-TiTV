package TITV_learning.Code.Bai73_CachLuuDoiTuongVaoTapTin.ArrayListStudents;

import java.io.*;

public class viduGhiDoiTuong {
    //ghi 1 bạn sv xuống file
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai73_CachLuuDoiTuongVaoTapTin/file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            Students st = new Students("01","peter",2000,10.0f);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
