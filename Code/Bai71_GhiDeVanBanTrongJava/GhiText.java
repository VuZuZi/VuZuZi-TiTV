package TITV_learning.Code.Bai71_GhiDeVanBanTrongJava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiText {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        // 1. ghi note vào cửa sổ control(run)
//        PrintWriter pw = new PrintWriter(System.out);
//        pw.println("Xin chào, tôi là Vũ");
//        pw.flush();

        // pw.flush(); đẩy giá trị lưu trữ xuống

        // 2. tạo ra 1 file hoặc truy cập vào file theo đường dẫn nếu có rồi ghi vào
        try {
            PrintWriter pw = new PrintWriter("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai71_GhiDeVanBanTrongJava\\File_new.txt","UTF-8");
            pw.println("Xin chào, tôi là Vũ");
            pw.print("Dữ liệu: ");
            pw.println("https://cafedev.vn/tu-hoc-java-lop-bufferedwriter-java/ BuferWriter file tham khảo");
            pw.print("Pi =");
            pw.println(3.14159265453);
            pw.println(3.14159265453);
            pw.println('a');// kiểu dữ liệu char

            Students st = new Students(1,"Nguyễn Văn A");
            pw.println(st);
            pw.flush(); // đẩy dữ liệu xuống file
            pw.close(); // đóng file lại nếu không sẽ không ghi được dữ liệu // lưu ý đóng file nếu tự mở ra để đọc


        }catch (Exception e){
            System.out.println(e);
        }

    }
}
