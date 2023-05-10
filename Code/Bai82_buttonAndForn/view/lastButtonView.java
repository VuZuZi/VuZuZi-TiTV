package TITV_learning.Code.Bai82_buttonAndForn.view;

import TITV_learning.Code.Bai82_buttonAndForn.controller.lastButtonListener;
import TITV_learning.Code.Bai82_buttonAndForn.model.lastButtonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class lastButtonView extends JFrame {
    private lastButtonModel lastButtonModel;
    private JLabel jLabel;

    public lastButtonView() {
        this.lastButtonModel = new lastButtonModel(1);

        this.init();
    }

    private void init() {
        this.setTitle("Nút bấm cuối cùng");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,300);

        JPanel jPanelCenter = new JPanel();
        jPanelCenter.setLayout(new GridLayout(2,2));

        // tạo listener
        ActionListener lastListener = new lastButtonListener(this);

        Font font = new Font("Arial",Font.BOLD,30);

        JButton button_1 = new JButton("1");
        button_1.addActionListener(lastListener);
        JButton button_2 = new JButton("2");
        button_2.addActionListener(lastListener);
        JButton button_3 = new JButton("3");
        button_3.addActionListener(lastListener);
        JButton button_4 = new JButton("4");
        button_4.addActionListener(lastListener);


        //set font chữ cho các nút bấm
        button_1.setFont(font);
        button_2.setFont(font);
        button_3.setFont(font);
        button_4.setFont(font);


        jPanelCenter.add(button_1);
        jPanelCenter.add(button_2);
        jPanelCenter.add(button_3);
        jPanelCenter.add(button_4);

        JPanel jPanelFooter = new JPanel();//auto borderlayout
        jLabel = new JLabel("--------");
        jLabel.setFont(font);

        jPanelFooter.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanelCenter,BorderLayout.CENTER);
        this.add(jPanelFooter,BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void changeTo_1(){
        this.lastButtonModel.setValue_1();
        jLabel.setText("Last button: "+this.lastButtonModel.getValue());
    }
    public void changeTo_2(){
        this.lastButtonModel.setValue_2();
        jLabel.setText("Last button: "+this.lastButtonModel.getValue());
    }
    public void changeTo_3(){
        this.lastButtonModel.setValue_3();
        jLabel.setText("Last button: "+this.lastButtonModel.getValue());
    }
    public void changeTo_4(){
        this.lastButtonModel.setValue_4();
        jLabel.setText("Last button: "+this.lastButtonModel.getValue());
    }
}
