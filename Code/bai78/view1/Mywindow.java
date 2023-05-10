package TITV_learning.Code.bai78.view1;

import javax.swing.*;

public class Mywindow extends JFrame {
    public Mywindow(){
    }
    public void showIt(){
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void showIt(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width,height);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Mywindow m1 = new Mywindow();
        m1.showIt();

        Mywindow m2 = new Mywindow();
        m2.showIt("Windows 2");
    }
}
