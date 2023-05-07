package TITV_learning.Code.Bai63QueueAndDeque;

import java.util.*;

public class ViduDeque {
    public static void main(String[] args) {
    Deque<String> danhsachSV = new ArrayDeque<String>();

    //Deque là 1 hàng đợi có 2 đầu
        danhsachSV.offer("Nguyễn Văn FG");
        danhsachSV.offer("Nguyễn Văn D");
        danhsachSV.offer("Nguyễn Văn E");
        danhsachSV.offer("Nguyễn Văn B");
        danhsachSV.offer("Nguyễn Văn A");

        danhsachSV.offerFirst("Nguyễn Văn Tài");
        danhsachSV.offerLast("Lê Văn Luyện");

        while (true){
            String ten = danhsachSV.poll();
            if (ten == null){
                break;
            }
            System.out.println(ten);
        }

    }
}
