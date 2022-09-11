package TiTV.Bai67;

import java.io.File;
import java.io.IOException;

public class ViduTaoTapTinVaThuMuc {
    public static void main(String[] args) {
        // lưu ý: trong MS Windows: \ => \\
        // Ví dụ "c:\\founder1\\founder2\\name....

        File folder1 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai67");
        // kiểm tra thư mực hay tập tin có tồn tại hay không
        System.out.println("kiểm tra folder1 có tồn tại hay không: "+folder1.exists());

        // tạo thư mục
        // có 2 phương thức
        // mkdir()
        File d1 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai67\\Directory_1");
        d1.mkdir();// tạo 1 thư mục

        //mkdirs() tạo ra nhiều thư mục cùng lúc
        File d2 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai67\\Directory_1\\Directory_2\\Directory_3\\Directory_4");
        d2.mkdirs();

        //tạo ra 1 tập tin (có phần mở rộng: .exe, .txt, .doc, .xls ...)
        File file1 = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai67\\Directory_1\\Vidu1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            //không có quyền tạo tập tin
            // ổ cứng bị đầy
            //đường dẫn bị sai
            e.printStackTrace();
        }

        // phương thức boolean canExecute() => kiểm tra file này có thể chạy được không
        // phương thức String getCanonicalPath() => trả về địa chỉ file
    }
}
