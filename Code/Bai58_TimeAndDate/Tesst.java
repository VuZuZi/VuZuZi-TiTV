package TITV_learning.Code.Bai58_TimeAndDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Tesst {
    public static void main(String[] args) {
        Long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
//            System.out.println("test");
        }
        Long t2 = System.currentTimeMillis();

        System.out.println("Trước khi chạy for:"+(t1/1000)+"s");
        System.out.println("Sau khi chạy for: "+(t2/1000)+"s");
        System.out.println("thời gian chạy for: "+((t2-t1)/1000)+"s");
        System.out.println("thời gian chạy for: "+((t2-t1))+"mls");

        // đo thời gian
        System.out.println("3000 năm = "+ TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("10 giờ = "+TimeUnit.HOURS.toSeconds(10)+"s");

        // hiển thị thời gian
        Date d = new Date();
        System.out.println("Today, "+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        //CALENDAR
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DATE)+"-"+ (1+calendar.get(Calendar.MONTH))+"-"+ calendar.get(Calendar.YEAR));

        // cộng thêm vào date 7 ngày
        calendar.add(Calendar.DATE,7);
        System.out.println("7 ngày sau: "+calendar.get(Calendar.DATE)+"-"+ (1+calendar.get(Calendar.MONTH))+"-"+ calendar.get(Calendar.YEAR));

        //Dateformat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm-ss");
        System.out.println(df.format(d));
    }
}
