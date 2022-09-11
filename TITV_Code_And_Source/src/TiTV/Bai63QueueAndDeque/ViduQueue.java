package TiTV.Bai63QueueAndDeque;

import java.util.LinkedList;
import java.util.Queue;

public class ViduQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new LinkedList<String>();

        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyễn Văn A");
        danhSachSV.offer("Nguyễn Văn B");
        danhSachSV.offer("TITV 2");

        // Queue cái gì vào trước lấy ra trước

        while (true){
            String ten = danhSachSV.poll(); //pool lấy ra rồi xóa khỏi danh sách // peek => lấy ra nhưng không xóa
            if (ten == null){
                break;
            }
            System.out.println(ten);

        }

    }
}
