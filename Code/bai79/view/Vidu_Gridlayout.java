package TITV_learning.Code.bai79.view;

import javax.swing.*;
import java.awt.*;

public class Vidu_Gridlayout extends JFrame {
    public Vidu_Gridlayout(){
        this.setTitle("GridLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null);//hiển thị cửa sổ chươgn trình ở giữa màn hình

        //setLayout
        GridLayout gridLayout = new GridLayout();
        GridLayout gridLayout1 = new GridLayout(4,4);
        GridLayout gridLayout2 = new GridLayout(4,4,25,25);

        for (int i = 0; i < 16; i++) {
            JButton jButton = new JButton(String.valueOf(i+1));
            this.add(jButton);
        }

        this.setLayout(gridLayout2);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Vidu_Gridlayout();
    }

}
