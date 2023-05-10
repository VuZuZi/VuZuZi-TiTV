package TITV_learning.Code.bai84MayTinh.view;

import TITV_learning.Code.bai84MayTinh.controller.MiniCalculatorActionListener;
import TITV_learning.Code.bai84MayTinh.model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;

    private JLabel jLabelFirstValue;
    private JLabel jLabelScValue;
    private JLabel jLabelAnswerValue;
    private JTextField fieldFirst,fieldsecond,fieldAnswer;

    public MiniCalculatorView() throws HeadlessException {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(600,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabelFirstValue = new JLabel("First Value");
        jLabelScValue = new JLabel("Second Value");
        jLabelAnswerValue = new JLabel("Answer");

        Font font = new Font("Arial",Font.BOLD,40);
        jLabelFirstValue.setFont(font);
        jLabelScValue.setFont(font);
        jLabelAnswerValue.setFont(font);

        fieldFirst = new JTextField(50);
        fieldsecond = new JTextField(50);
        fieldAnswer = new JTextField(50);
        fieldFirst.setFont(font);
        fieldsecond.setFont(font);
        fieldAnswer.setFont(font);

        JPanel panelIO = new JPanel();
        panelIO.setLayout(new GridLayout(3,2));
        panelIO.add(jLabelFirstValue);
        panelIO.add(fieldFirst);
        panelIO.add(jLabelScValue);
        panelIO.add(fieldsecond);
        panelIO.add(jLabelAnswerValue);
        panelIO.add(fieldAnswer);

        MiniCalculatorActionListener listener = new MiniCalculatorActionListener(this);

        JButton jButtonPlus = new JButton("+");
        jButtonPlus.setFont(font);
        jButtonPlus.addActionListener(listener);

        JButton jButtonMinus = new JButton("-");
        jButtonMinus.setFont(font);
        jButtonMinus.addActionListener(listener);

        JButton jButtonMul = new JButton("*");
        jButtonMul.setFont(font);
        jButtonMul.addActionListener(listener);

        JButton jButtonDiv = new JButton("/");
        jButtonDiv.setFont(font);
        jButtonDiv.addActionListener(listener);

        JButton jButtonPow = new JButton("^");
        jButtonPow.setFont(font);
        jButtonPow.addActionListener(listener);

        JButton jButtonMod = new JButton("%");
        jButtonMod.setFont(font);
        jButtonMod.addActionListener(listener);

        JPanel jPanelButton = new JPanel();
        jPanelButton.setLayout(new GridLayout(2,3));
        jPanelButton.add(jButtonPlus);
        jPanelButton.add(jButtonMinus);
        jPanelButton.add(jButtonMul);
        jPanelButton.add(jButtonDiv);
        jPanelButton.add(jButtonPow);
        jPanelButton.add(jButtonMod);


        this.setLayout(new BorderLayout());
        this.add(panelIO, BorderLayout.CENTER);
        this.add(jPanelButton,BorderLayout.SOUTH);


        this.setVisible(true);
    }

    public void sum(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.sum();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");

    }
    public void minus(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.minus();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void mul(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.mul();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void div(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.div();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void pow(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.pow();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void mod(){
        double firstNumber = Double.parseDouble(fieldFirst.getText());
        double secNumber = Double.parseDouble(fieldsecond.getText());
        this.miniCalculatorModel.setFirstValue(firstNumber);
        this.miniCalculatorModel.setSecondValue(secNumber);
        this.miniCalculatorModel.mod();

        //đưa kết quả vào texfile
        this.fieldAnswer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
}
