package TiTV.Bai43_Overloading;

public class MyMath {
    public int findMin(int a, int b){
        if (a>b){
            return b;
        }else {
            return a;
        }
    }
    public double findMin(double a, double b){
        if (a>b){
            return b;
        }else {
            return a;
        }
    }

    public double findTotal(double a, double b){
        return a+b;
    }
    public double findTotal(double[] arr){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
