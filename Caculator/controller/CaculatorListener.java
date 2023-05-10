package TITV_learning.Caculator.controller;

import TITV_learning.Caculator.view.CaculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaculatorListener implements ActionListener {
    private CaculatorView caculatorView;

    public CaculatorListener(CaculatorView caculatorView) {
        this.caculatorView = caculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valAdd = e.getActionCommand();

                this.caculatorView.addNumber(valAdd);
    }

}
