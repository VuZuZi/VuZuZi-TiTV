package TiTV.Bai72_DocDuLieuDangVanBanBangFileText;

import javafx.scene.shape.Path;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class DocText {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai72_DocDuLieuDangVanBanBangFileText\\FileThongTin.txt","UTF-8");
            pw.println("URL tham khảo PrintWriter: ");
            pw.println("https://hoclaptrinh.vn/posts/doc-file-trong-java-voi-lop-bufferedreader");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        File f = new File("D:\\TITV_Java\\TITV_Code_And_Source\\src\\TiTV\\Bai72_DocDuLieuDangVanBanBangFileText\\FileThongTin.txt");
        /*   // Cách 1
        try {
            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8); // bảng mã StandardCharsets.UTF_8 có thể đọc được văn bản tiếng việt
            String line = null;
            while (true){
                line = br.readLine();
                if (line == null){
                    break;
                }else {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // in ra lỗi
        }
        */

        // Cách 2:
        try {
            List<String> allText = Files.readAllLines(f.toPath(),StandardCharsets.UTF_8);
            for (String line: allText
                 ) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
