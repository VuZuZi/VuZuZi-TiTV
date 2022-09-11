package TiTV.Bai63QueueAndDeque;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViduPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSV = new PriorityQueue<>();
        //PriorityQueue tự động sắp xếp thông qua chữ cái đầu của chuỗi truyền vào

        danhSachSV.offer("TITV 2");
        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyễn Văn B");
        danhSachSV.offer("Nguyễn Văn A");
        //Nguyễn Văn A
        //Nguyễn Văn B
        //TITV 1
        //TITV 2

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
