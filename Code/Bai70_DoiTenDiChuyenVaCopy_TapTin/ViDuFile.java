package TITV_learning.Code.Bai70_DoiTenDiChuyenVaCopy_TapTin;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
    public static void CopyAll(File f1, File f2){
        try { // copy bản thân thư mục gốc
            Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING); // chỉ copy thư mục không copy được dữ liệu bên trong
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (f1.isDirectory()){
            //Copy các tập tin và thư mục con
            File[] mangCon = f1.listFiles();
            for (File file:mangCon) {
                File file_new = new File(f2.getAbsolutePath()+"/"+file.getName());
                CopyAll(file,file_new);
            }
        }
    }
    public static void main(String[] args) {
//        File f0 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\File_1.txt");
        File f1 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\File_2.txt");
        File f2 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\File_2xyz.txt");

        // 1.Thay đổi tên tập hoặc thư mục
        // sử dụng file dể thay đổi tên
//        f0.renameTo(f1);

        // Sử dụng files để thay đổi tên
//        try { // dùng try catch vì có những file không có quyền truy cập hoặc file không tồn tại
//            Files.move(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING); //f1.toPath lấy ra đường dẫn của f1 //REPLACE_EXISTING nếu file đã tồn tại thì di chuyển đè lên file cũ
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 2. di chuyển file địa chỉ f2 -> f2_new (di chuyển cả thư mục và tập tin con)
//        File f_2new = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\f0\\File_2xyz.txt");
//        try {
//            Files.move(f2.toPath(),f_2new.toPath(),StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 3. CopyFile
//        File f_0 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\f0");
//        File f_0_Copy = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\f0_Copy");
//
//        try {
//            Files.copy(f_0.toPath(),f_0_Copy.toPath(),StandardCopyOption.REPLACE_EXISTING); // chỉ copy thư mục không copy được dữ liệu bên trong
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // để copy được dữ liệu trong thư mục:
        File f0 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\f_0");
        File f0_Copy = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai70_DoiTenDiChuyenVaCopy_TapTin\\f_0_Copy");
        ViDuFile.CopyAll(f0,f0_Copy);
    }
}
