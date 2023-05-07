package TITV_learning.Code.bai80_MayTinh.View;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator(){
        this.setTitle("Caculator");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        BorderLayout borderLayout = new BorderLayout();
        GridLayout gridLayout = new GridLayout(5,3);


            JTextField jTextField = new JTextField();
            this.add(jTextField);

            JPanel jPanel_head = new JPanel();
            jPanel_head.setLayout(new BorderLayout());
            jPanel_head.add(jTextField, BorderLayout.CENTER);

            JPanel jPanel_button = new JPanel(new GridLayout(5,3));
        for (int i = 0; i < 10 ; i++) {
            JButton jButton = new JButton(String.valueOf(i));
            jPanel_button.add(jButton);
        }
        JButton jBC = new JButton("+");
        JButton jBT = new JButton("-");
        JButton jBN = new JButton("*");
        JButton jBCh = new JButton("/");
        JButton jbb = new JButton("=");
        jPanel_button.add(jBC);
        jPanel_button.add(jBT);
        jPanel_button.add(jBN);
        jPanel_button.add(jBCh);
        jPanel_button.add(jbb);

        this.setLayout(new BorderLayout());
        this.add(jPanel_head,BorderLayout.NORTH);
        this.add(jPanel_button,BorderLayout.CENTER);



        this.setVisible(true);
    }

    public static void main(String[] args) {
        //com.sun.java.swing.plaf.gtk.GTKLookAndFeel
        //com.sun.java.swing.plaf.motif.MotifLookAndFeel
        //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Calculator();
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
