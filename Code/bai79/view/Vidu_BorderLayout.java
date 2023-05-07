package TITV_learning.Code.bai79.view;

import javax.swing.*;
import java.awt.*;

public class Vidu_BorderLayout extends JFrame {
    public Vidu_BorderLayout(){
        this.setTitle("BorderLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);//hiển thị cửa sổ chươgn trình ở giữa màn hình

        //setLayout
        BorderLayout borderLayout = new BorderLayout();
        BorderLayout borderLayout1 = new BorderLayout(15,15);
        BorderLayout borderLayout2 = new BorderLayout();

        this.setLayout(borderLayout1);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");


        // add các thành phần vào layout
        this.add(jb1,BorderLayout.NORTH);
        this.add(jb2, BorderLayout.WEST);
        this.add(jb3, BorderLayout.SOUTH);
        this.add(jb4, BorderLayout.EAST);
        this.add(jb5,BorderLayout.CENTER);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Vidu_BorderLayout();
    }

}
