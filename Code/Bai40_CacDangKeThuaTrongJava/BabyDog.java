package TITV_learning.Code.Bai40_CacDangKeThuaTrongJava;

public class BabyDog extends Dog{

    public BabyDog(){
        super();
    }
    public void khoc(){
        System.out.println("oăng oẳng");
    }

    @Override
    public void sua() {
        System.out.println("chó con chưa biết sủa");
    }
}
