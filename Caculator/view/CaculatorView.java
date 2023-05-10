package TITV_learning.Caculator.view;

import TITV_learning.Caculator.controller.CaculatorListener;
import TITV_learning.Caculator.model.CaculatorModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CaculatorView extends JFrame {
    private JLabel jLabel;
    private CaculatorModel CaculatorModel;

    private static int nb1 = 0;
    private static int toanHang = -1;

    public CaculatorView(){
        this.CaculatorModel = new CaculatorModel("");

        this.init();
    }

    public void init() {
        this.setTitle("Caculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300,600);

        JPanel panelView = new JPanel();
        jLabel = new JLabel("-Start-");
        panelView.add(jLabel);

        ActionListener listener = new CaculatorListener(this);


        JPanel panelButton = new JPanel();

        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton(i+"");
            panelButton.add(jButton);
            jButton.addActionListener(listener);
        }
        JButton cong = new JButton("+");
        panelButton.add(cong);
        cong.addActionListener(listener);
        JButton tru = new JButton("-");
        panelButton.add(tru);
        tru.addActionListener(listener);
        JButton nhan = new JButton("*");
        panelButton.add(nhan);
        nhan.addActionListener(listener);
        JButton chia = new JButton("c");
        panelButton.add(chia);
        chia.addActionListener(listener);
        JButton bang = new JButton("=");
        panelButton.add(bang);
        bang.addActionListener(listener);




        GridLayout gridLayout = new GridLayout(5,4);
        panelButton.setLayout(gridLayout);

        this.setLayout(new BorderLayout());
        this.add(panelView,BorderLayout.CENTER);
        this.add(panelButton,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void addNumber(String add){
        if (add.equals("+")){
            this.xetToanHang();
            toanHang = 1;
            this.CaculatorModel.setValue("");
            jLabel.setText("+"+this.CaculatorModel.getValue());
        }
        if (add.equals("-")){
            this.xetToanHang();
            toanHang = 2;
            this.CaculatorModel.setValue("");
            jLabel.setText("-"+this.CaculatorModel.getValue());
        }
        if (add.equals("*")){
            this.xetToanHang();
            toanHang = 3;
            this.CaculatorModel.setValue("");
            jLabel.setText(this.CaculatorModel.getValue());
        }
        if (add.equals("=")){
            this.xetToanHang();
            this.CaculatorModel.setValue(String.valueOf(nb1));
            jLabel.setText(this.CaculatorModel.getValue());
            toanHang = -1;

        }
        if (add.equals("c")){
            toanHang = -1;
            nb1=0;
            this.CaculatorModel.setValue("0");
            jLabel.setText("Start");
        }

        else {
        this.CaculatorModel.updateValue(add);
        jLabel.setText(this.CaculatorModel.getValue());
        }
    }

    public void xetToanHang(){
        if (toanHang == -1){
            System.out.println(toanHang);
            try {
                nb1 = Integer.parseInt(this.CaculatorModel.getValue());
            }catch (Exception e){
                nb1 = nb1;
            }
        }
        if (toanHang == 1){
            System.out.println(toanHang);
            try {
                nb1 += Integer.parseInt(this.CaculatorModel.getValue());
            }catch (Exception e){
            nb1 = nb1;
        }
        }
        if(toanHang == 2){
            try {
                nb1 = nb1 + (Integer.parseInt(this.CaculatorModel.getValue()));
            }catch (Exception e){
                nb1 = nb1;
            }

        }
        if (toanHang ==3){
            System.out.println(this.CaculatorModel.getValue());
            String[] number = this.CaculatorModel.getValue().split("\\*") ;
            nb1 *=Integer.parseInt(number[1]);
        }
    }


}
