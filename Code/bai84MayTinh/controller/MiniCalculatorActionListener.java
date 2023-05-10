package TITV_learning.Code.bai84MayTinh.controller;

import TITV_learning.Code.bai84MayTinh.view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorActionListener implements ActionListener {

    private MiniCalculatorView calculatorView;

    public MiniCalculatorActionListener(MiniCalculatorView calculatorView) {
        this.calculatorView = calculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("+")) {
            this.calculatorView.sum();
        } else if (actionCommand.equals("-")) {
            this.calculatorView.minus();
        } else if (actionCommand.equals("*")) {
            this.calculatorView.mul();
        } else if (actionCommand.equals("/")) {
            this.calculatorView.div();
        } else if (actionCommand.equals("^")) {
            this.calculatorView.pow();
        } else if (actionCommand.equals("%")) {
            this.calculatorView.mod();
        }
    }
}
