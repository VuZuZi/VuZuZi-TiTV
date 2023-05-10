package TITV_learning.Code.Bai85JtexAria.view;

import TITV_learning.Code.Bai85JtexAria.controller.TimKiemListener;
import TITV_learning.Code.Bai85JtexAria.model.TimKiemModel;
import com.sun.xml.internal.ws.handler.HandlerException;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JLabel jLabelVanBan;
    private JLabel jLabel_TuKoa;
    private JLabel jLabel_KQ;
    private JTextArea textArea;
    private JTextField jTextFieldTuKhoa;

    public TimKiemView() throws HandlerException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setTitle("Tìm Kiếm");
        this.setSize(500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial",Font.BOLD,40);

        jLabelVanBan = new JLabel("Văn Bản");
        jLabelVanBan.setFont(font);

        textArea = new JTextArea(30,40);
        textArea.setFont(font);

        TimKiemListener listener = new TimKiemListener(this);


        JPanel jPanel_frooter = new JPanel();

        jLabel_TuKoa = new JLabel("Từ Khoá");
        jLabel_TuKoa.setFont(font);
        jTextFieldTuKhoa = new JTextField();
        jTextFieldTuKhoa.setFont(font);

        JButton jButton_ThongKe = new JButton("Thống kê");
        jButton_ThongKe.setFont(font);
        jButton_ThongKe.addActionListener(listener);
        jButton_ThongKe.setBackground(Color.BLUE);
        jButton_ThongKe.setBorderPainted(false);
        jButton_ThongKe.setOpaque(true);
        
        jLabel_KQ = new JLabel();
        jLabel_KQ.setBackground(Color.yellow);
        jLabel_KQ.setOpaque(true);

        jPanel_frooter.setLayout(new GridLayout(2,2));
        jPanel_frooter.add(jLabel_TuKoa);
        jPanel_frooter.add(jTextFieldTuKhoa);
        jPanel_frooter.add(jButton_ThongKe);
        jPanel_frooter.add(jLabel_KQ);


        this.setLayout(new BorderLayout());
        this.add(jLabelVanBan,BorderLayout.NORTH);
        this.add(textArea,BorderLayout.CENTER);
        this.add(jPanel_frooter, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void timKiem(){
        this.timKiemModel.setVanBan(textArea.getText());
        this.timKiemModel.setTuKhoa(jTextFieldTuKhoa.getText());
        this.timKiemModel.timkiem();
        this.jLabel_KQ.setText(this.timKiemModel.getKetQua());
//
//        this.timKiemModel.setVanBan(textArea.getText());
//        this.timKiemModel.setTuKhoa(jTextFieldTuKhoa.getText());
//        this.timKiemModel.timkiem();
//        this.jLabel_KQ.setText(this.timKiemModel.getKetQua());
    }
}
