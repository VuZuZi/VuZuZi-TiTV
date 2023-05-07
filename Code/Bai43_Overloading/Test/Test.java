package TITV_learning.Code.Bai43_Overloading.Test;

import TITV_learning.Code.Bai43_Overloading.MyMath;

public class Test {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        System.out.println("tìm min của 2 số a và b truyền vào(66,55)");
        System.out.println(myMath.findMin(66,55));

        System.out.println("tìm min của 2 số a và b truyền vào(66.66,55.55)");
        System.out.println(myMath.findMin(66.66,55.55));

        System.out.println("tìm tổng của 2 số a và b truyền vào(66,55)");
        System.out.println(myMath.findTotal(66,55));

        System.out.println("tìm tổng của arr truyền vào 2,4,6,8");
        double arr[] = new double[]{2,4,6,8};
        System.out.println(myMath.findTotal(arr));
    }
}
