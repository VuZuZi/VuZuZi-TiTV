package TiTV.Bai40_CacDangKeThuaTrongJava;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    public void fly(){
        System.out.println(this.getName()+" đang bay");
    }
}
