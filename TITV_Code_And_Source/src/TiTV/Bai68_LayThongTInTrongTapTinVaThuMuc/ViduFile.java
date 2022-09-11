package TiTV.Bai68_LayThongTInTrongTapTinVaThuMuc;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ViduFile {
    File file;

    public ViduFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        return this.file.canExecute(); // kiểm tra file có thể thực thi hay không
    }
    public boolean kiemTraDoc(){
        return this.file.canRead(); // kiểm tra file có thể đọc hay không
    }
    public boolean kiemTraGhi(){
        return this.file.canWrite();// kiểm tra file có thể ghi hay không
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTenFile(){
        System.out.println(this.file.getName());
    }
    public void kiemTraThuMucHayTapTin(){
        if (this.file.isDirectory()){
            System.out.println("đây là thư mục");
        }else if (this.file.isFile()){
            System.out.println("đây là tập tin");
        }
    }
    public void inDanhSachCacFileCon(){
        if (this.file.isDirectory()){
            System.out.println("Các tập tin con/ thư mục con là: ");
            File[] mangCon = this.file.listFiles();
            for (File file:mangCon
                 ) {
                System.out.println(file.getAbsolutePath());
            }
        }else if (this.file.isFile()){
            System.out.println("đây là tập tin, không có dữ liệu con bên trong.");
        }
    }
    public void inCayThuMuc(){
        this.inChiTietCayThuMuc(this.file,1);
    }
    public void inChiTietCayThuMuc(File f, int bac){
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");// \t = tab
            }
        System.out.print(f.getName());
        if (f.canRead()&&f.isDirectory()){
            File[] mangCon = f.listFiles();
            for (File file:mangCon
            ) {
                inChiTietCayThuMuc(file,bac+1);
            }}

    }

    public static void main(String[] args) {
        int luachon = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên file: ");
        String tenFile = scanner.nextLine();
        ViduFile vdf = new ViduFile(tenFile);
        do {
            System.out.println(
                    "1: Kiểm tra file có thể thực thi\n" +
                    "2: Kiểm tra file có thể thực đọc\n" +
                    "3: Kiểm tra file có thể thực ghi\n"+
                    "4: In đường dẫn\n" +
                    "5: In tên file\n" +
                    "6: Kiểm tra file là thư mục hay tập tin\n"+
                    "7: In ra danh sách các file con:\n"+
                    "8: In ra các thư mục\n"+
                    "0: Thoát chương trình");
            System.out.print("Nhập lựa chọn của bạn: ");
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon){
                case 1:
                    System.out.println(vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println(vdf.kiemTraDoc());break;
                case 3:
                    System.out.println(vdf.kiemTraGhi());break;
                case 4:
                    vdf.inDuongDan();break;
                case 5:
                    vdf.inTenFile();break;
                case 6:
                    vdf.kiemTraThuMucHayTapTin();break;
                case 7:
                    vdf.inDanhSachCacFileCon();break;
                case 8:
                    vdf.inCayThuMuc();break;
            }

        }while (luachon!=0);
    }
}
