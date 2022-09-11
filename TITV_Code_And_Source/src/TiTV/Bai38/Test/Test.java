package TiTV.Bai38.Test;

import TiTV.Bai38.Computer;
import TiTV.Bai38.Country;
import TiTV.Bai38.Date;
import TiTV.Bai38.HangSanXuat;

public class Test {
    public static void main(String[] args){
        Country country = new Country("U.S.A 0115","Nước Mỹ");
        Country country1 = new Country("U.K22","Kingdom");
        HangSanXuat Intel = new HangSanXuat("Intel",country);
        HangSanXuat MQ = new HangSanXuat("MQ",country1);
        Date date = new Date(10,10,2022);
        Date date1 = new Date(10,11,2021);
        Computer computer = new Computer(MQ,date,500,5);
    }
}
