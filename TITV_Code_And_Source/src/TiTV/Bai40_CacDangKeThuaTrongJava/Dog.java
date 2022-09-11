package TiTV.Bai40_CacDangKeThuaTrongJava;

public class Dog extends Animal{

    public Dog() {
        super("Dog");
    }

    public void sua(){
        System.out.println("gow gow");
    }

    @Override
    public void eat() {
        System.out.println("chon chó đang ăn xương");
    }
}
