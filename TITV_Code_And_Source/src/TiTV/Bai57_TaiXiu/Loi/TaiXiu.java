package TiTV.Bai57_TaiXiu.Loi;

import java.util.Scanner;

public class TaiXiu {
    private int xx1 = (int) (Math.random() * (6 - 1 + 1) + 1);
    private int xx2 = (int) (Math.random() * (6 - 1 + 1) + 1);
    private int xx3 = (int) (Math.random() * (6 - 1 + 1) + 1);

    public TaiXiu(){}

    public TaiXiu(int xx1, int xx2, int xx3) {
        this.xx1 = xx1;
        this.xx2 = xx2;
        this.xx3 = xx3;
    }

    public int getXx1() {
        return xx1;
    }

    public void setXx1(int xx1) {
        this.xx1 = xx1;
    }

    public int getXx2() {
        return xx2;
    }

    public void setXx2(int xx2) {
        this.xx2 = xx2;
    }

    public int getXx3() {
        return xx3;
    }

    public void setXx3(int xx3) {
        this.xx3 = xx3;
    }

    public String xucXac(){
        int kq = this.xx1+this.xx2+this.xx3;
        if (kq <=10){
            return "Xỉu: "+kq+" = "+this.xx1+" + "+this.xx2+" + "+this.xx3;
        }else return "Tài: "+kq+" = "+this.xx1+" + "+this.xx2+" + "+this.xx3;
    }
}
