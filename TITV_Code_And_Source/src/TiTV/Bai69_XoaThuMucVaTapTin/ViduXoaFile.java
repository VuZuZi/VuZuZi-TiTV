package TiTV.Bai69_XoaThuMucVaTapTin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ViduXoaFile {
    public static void xoaFile(File fx){
        if (fx.isFile()){ // nếu là tập tin thì xóa
            System.out.println("đã xóa "+fx.getAbsolutePath());
            fx.delete();
        }else if (fx.isDirectory()){ // nếu là thư mục thì
            File[] mangCon = fx.listFiles(); // lấy các file con
            for (File f: mangCon
                 ) {
                // xóa các file con
                xoaFile(f);
            }
            System.out.println("đã xóa "+fx.getAbsolutePath());
            fx.delete();// xóa thư mục sau khi đã xóa các file con
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File f1 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai69_XoaThuMucVaTapTin\\f0");
        File f2 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai69_XoaThuMucVaTapTin\\f0_r");
        File f3 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai69_XoaThuMucVaTapTin\\abc.txt");
/*
//        f1.deleteOnExit(); // không xóa được vì đây không phải là thư mục rỗng
        f2.deleteOnExit(); // đã xóa thư mục f0_r vì đây là thư mục rỗng
        f3.deleteOnExit();// đã xóa file .txt // tập tin sẽ không xóa được nếu đang được mở ở chương trình khác

        System.out.println(f2.delete());// false file không tồn tại

        ViduXoaFile.xoaFile(f1);
*/
        // Sử dụng files(có s) để xóa tập tin và thư mục
        Path p0 = f1.toPath();
        Path p0_1 = f2.toPath();
        Path p_Vidu = f3.toPath();
        try {
//            Files.deleteIfExists(p0); // thư mục có nội dung bên trong không xáo được

            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_Vidu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
