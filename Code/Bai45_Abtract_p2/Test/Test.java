package TITV_learning.Code.Bai45_Abtract_p2.Test;

import TITV_learning.Code.Bai45_Abtract_p2.HangSanXuat;
import TITV_learning.Code.Bai45_Abtract_p2.Phuong_Tien.MayBay;
import TITV_learning.Code.Bai45_Abtract_p2.Phuong_Tien.XeDap;
import TITV_learning.Code.Bai45_Abtract_p2.Phuong_Tien.XeOto;

public class Test {
    public static void main(String[] args) {
        HangSanXuat hangSanXuat = new HangSanXuat("Toyota","Đức");
        HangSanXuat hangSanXuat1 = new HangSanXuat("Vinfast","Việt Nam");



        XeOto xeOto = new XeOto("Xăng E92",hangSanXuat1);
        XeDap xeDap = new XeDap(hangSanXuat);
        MayBay mayBay = new MayBay("xăng E34",hangSanXuat1);

        mayBay.catCanh();
        mayBay.haCanh();

        System.out.println("Vân tốc máy bay: "+mayBay.layVanToc());
        System.out.println("vân tốc oto: "+xeOto.layVanToc());
        System.out.println("vận tốc xe đạp: "+xeDap.layVanToc());

        System.out.println("hãng sản xuất xe đạp: "+xeDap.layTenHangSanXuat());
        xeDap.batDau();
        xeDap.tangToc();
        xeDap.dungLai();

    }
}
