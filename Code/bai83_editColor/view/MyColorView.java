package TITV_learning.Code.bai83_editColor.view;

import TITV_learning.Code.bai83_editColor.controller.MyColorListener;
import TITV_learning.Code.bai83_editColor.model.MyColorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;

    public MyColorView() {
        this.myColorModel = new MyColorModel();

        this.init();
    }

    public void init() {
        this.setTitle("My Color");
        this.setSize(500,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font fontText = new Font("Arial",Font.BOLD,40);
        JPanel jPanelText = new JPanel();
        this.jLabel = new JLabel("TEXT");
        jLabel.setFont(fontText);
        jPanelText.add(jLabel);

        JPanel jPanelBt = new JPanel();
        jPanelBt.setLayout(new GridLayout(2,3,10,10));

        Font font = new Font("Arial",Font.BOLD,25);

        ActionListener actionListener = new MyColorListener(this);


        JButton b1 = new JButton("Red text");
        b1.setFont(font);
        b1.setForeground(Color.red);
        b1.addActionListener(actionListener);
        JButton b2 = new JButton("Yellow text");
        b2.setFont(font);
        b2.setForeground(Color.YELLOW);
        b2.addActionListener(actionListener);

        JButton b3 = new JButton("Blue text");
        b3.setFont(font);
        b3.setForeground(Color.BLUE);
        b3.addActionListener(actionListener);


        JButton bg1 = new JButton("Red Background");
        bg1.setFont(font);
        bg1.setBackground(Color.red);
        bg1.setBorderPainted(false);
        bg1.setOpaque(true);
        bg1.addActionListener(actionListener);


        JButton bg2 = new JButton("Yellow Background");
        bg2.setFont(font);
        bg2.setBackground(Color.yellow );
        bg2.setBorderPainted(false);
        bg2.setOpaque(true);
        bg2.addActionListener(actionListener);



        JButton bg3 = new JButton("Blue Background");
        bg3.setFont(font);
        bg3.setBackground(Color.BLUE );
        bg3.setBorderPainted(false);
        bg3.setOpaque(true);
        bg3.addActionListener(actionListener);



        jPanelBt.add(b1);
        jPanelBt.add(b2);
        jPanelBt.add(b3);
        jPanelBt.add(bg1);
        jPanelBt.add(bg2);
        jPanelBt.add(bg3);


        this.setLayout(new BorderLayout(10,10));//khoang cach
        this.add(jPanelText,BorderLayout.NORTH);
        this.add(jPanelBt,BorderLayout.CENTER);

        this.setVisible(true);

    }

    public void changeColor(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeColorB(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);

    }
}
