package TITV_learning.Code.bai79.view;

import javax.swing.*;
import java.awt.*;

public class Vidu_flowlayout extends JFrame {
    public Vidu_flowlayout(){
        this.setTitle("Flowlayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);//hiển thị cửa sổ chươgn trình ở giữa màn hình

        //setLayout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout_1 = new FlowLayout(FlowLayout.RIGHT);
        FlowLayout flowLayout_2 = new FlowLayout(FlowLayout.CENTER, 50,60);

        this.setLayout(flowLayout_2);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");

        // add các thành phần vào layout
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Vidu_flowlayout();
    }

}
