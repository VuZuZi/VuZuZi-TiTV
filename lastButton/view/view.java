package TITV_learning.lastButton.view;

import TITV_learning.lastButton.controller.listener;
import TITV_learning.lastButton.model.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class view extends JFrame {
    private model model;

    private JLabel jLabel;

    public view() {
        this.model = new model(1);

        this.init();
    }

    public void init() {
        this.setTitle("Last bt");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,300);

        JPanel jPanelText = new JPanel();
        jLabel = new JLabel("----");
        jPanelText.add(jLabel);

        JPanel jPanelBt = new JPanel();
        jPanelBt.setLayout(new GridLayout(2,2));

        ActionListener listener = new listener(this);

        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");

        jButton1.addActionListener(listener);

        jPanelBt.add(jButton1);
        jPanelBt.add(jButton2);
        jPanelBt.add(jButton3);
        jPanelBt.add(jButton4);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanelBt, BorderLayout.CENTER);

        this.setVisible(true);

    }
    public void change1(){
        this.model.setValue1();
        jLabel.setText("last: "+this.model.getValue());
    }
    public void change2(){
        this.model.setValue2();
        jLabel.setText("last: "+this.model.getValue());
    }
    public void change3(){
        this.model.setValue3();
        jLabel.setText("last: "+this.model.getValue());
    }
    public void change4(){
        this.model.setValue4();
        jLabel.setText("last: "+this.model.getValue());
    }


}
