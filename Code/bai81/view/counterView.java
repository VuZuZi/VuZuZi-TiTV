package TITV_learning.Code.bai81.view;

import TITV_learning.Code.bai81.controller.CounterListioner;
import TITV_learning.Code.bai81.model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class counterView extends JFrame {
    public CounterModel counterModel;
    public JButton up;
    public JButton down;
    public JLabel jLabel_Value;

    public counterView() {
        this.counterModel = new CounterModel();
        // khai báo các button


        this.init();
        this.setVisible(true);
    }

    // hàm khởi tạo
    public void init() {
        this.setTitle("Counter");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ActionListener ac =new CounterListioner(this);
        up = new JButton("Up");
        down = new JButton("Down");
        up.addActionListener(ac);
        down.addActionListener(ac);

        jLabel_Value = new JLabel(this.counterModel.getValue()+"", SwingConstants.CENTER);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(up, BorderLayout.WEST);
        jPanel.add(down, BorderLayout.EAST);
        jPanel.add(jLabel_Value, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);
    }
    public void increment(){
        this.counterModel.incresment();
        this.jLabel_Value.setText(this.counterModel.getValue()+"");
    }
    public void decrement(){
        this.counterModel.decrement();
        this.jLabel_Value.setText(this.counterModel.getValue()+"");
    }
}
