package TITV_learning.Code.Bai74_CachDocDoiTuongInFile;

import TITV_learning.Code.Bai73_CachLuuDoiTuongVaoTapTin.ArrayListStudents.Students;

import java.io.*;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {

        try {
            File file = new File("/Users/dilysbidb/IdeaProjects/untitled/src/TITV_learning/TITV_Code_And_Source/src/TiTV/Bai73_CachLuuDoiTuongVaoTapTin/file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            Students st1 = (Students) ois.readObject();

            System.out.println("Sinh viên 1: "+st1);
            System.out.println("mã sinh viên: "+st1.getMaSinhVien());

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
