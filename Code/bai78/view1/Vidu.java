package TITV_learning.Code.bai78.view1;

import javax.swing.*;

public class Vidu {
    public static void main(String[] args) {
        JFrame jf = new JFrame(); // gắn tên cho cửa sổ
        jf.setTitle("Vidu JFrame"); //set tille cho của sổ
        jf.setSize(600,400);// set kích cỡ

        // gán vị trí hiển thị
        jf.setLocation(300,300);

        // hiển thị cửa sổ chương trình
        jf.setVisible(true);

//        while (true){
//            System.out.println("chương trình đang chạy");
//        }

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // kết thúc chương trình khi đóng cửa sổ
//        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // không kết thúc chương trình khi đóng cửa sổ

    }
}
