package TITV_learning.Code.Bai46_Interface.Test;

import TITV_learning.Code.Bai46_Interface.MayTinhCasioFX500;

public class Test {
    public static void main(String[] args) {
        System.out.println("test câu a: ");
        MayTinhCasioFX500 mayTinhCasioFX500 = new MayTinhCasioFX500();

        System.out.println("6+3="+mayTinhCasioFX500.cong(6,3));
        System.out.println("6-3="+mayTinhCasioFX500.tru(6,3));
        System.out.println("6*3="+mayTinhCasioFX500.nhan(6,3));
        System.out.println("6/3="+mayTinhCasioFX500.chia(6,3));
        System.out.println("6+3="+mayTinhCasioFX500.cong(6,3));
    }
}
