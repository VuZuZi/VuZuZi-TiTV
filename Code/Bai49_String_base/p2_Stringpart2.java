package TITV_learning.Code.Bai49_String_base;

import java.util.Scanner;

public class p2_Stringpart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = "Toi la Vu";
        String s2 = "toi la vu";
        String s3 = "Iam is Vu";

//        Hàm equals => so sánh 2 chuỗi giống nhau hay không, phân biệt chữ hoa
//        System.out.println("s1 equals s2: "+s1.equals(s2)); //=> false

//         Hàm equalsIgnoreCase +> không phân biệt chữ hoa
        System.out.println("s1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));

        //Hàm compareTo => so sánh (>, <, =)
//        String sv1 = "Nguyễn Văn A";
//        String sv2 = "Nguyễn Văn a";
//        String sv3 = "Nguyễn Văn";
//        String sv4 = "Nguyễn Văn A";
//
//
//        System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2)); // - +> sv1 < sv2 // 2 chuỗi khác nhau chữ A và a => kết quả là 32
//        System.out.println("sv1 compareTo sv3: "+ sv1.compareTo(sv3)); // + +> sv1 > sv2 // sv3 giống sv1 tất cả ký tự nhưng thiếu bắt đầu ở dầu cách cuối cùng " " có mã ascii là 2 => kq 2
//        System.out.println("sv1 compareTo sv4: "+ sv1.compareTo(sv4)); // 0 +> sv1 = sv2


      //Xóa khoảng trắng trong chuỗi
//        String luachon;
//        System.out.print("nhập dãy có dấu cách cần xóa: ");
//        luachon = scanner.nextLine();
//        luachon = luachon.replaceAll(" ", "");
//        // Hàm regionMatches => so sánh 1 đoạn trong chuỗi => có phân biệt chữ hoa
//        String t1 = "Meo moi";
//        String t2 = "con moi";
//        String t3 = "con Moi";
//        boolean check = t1.regionMatches(4,t2,4,3);//(vị trí bắt đầu so sánh của chuỗi t1,chuỗi muốn so sánh,vị trí bắt đầu so sánh ở chuỗi t2, muốn so sáng bao nhiêu ký tự)
//        boolean check2 = t1.regionMatches(4,t3,4,3);
//        System.out.println("t1 regionMatches t2 bắt đầu ở vị trí thứ 4 và so sánh 3 giá trị: "+check);
//        System.out.println("t1 regionMatches t3 bắt đầu ở vị trí thứ 4 và so sánh 2 giá trị: "+check2);
//
//        // hàm so sánh startWith
//        String myNumber = "0799077222";
//        String st1 = "ABC";
//        System.out.println("My sđt có bắt đầu bằng 0799 hay không: "+myNumber.startsWith("0799"));
//        System.out.println("My sđt có bắt đầu bằng 0789 hay không: "+myNumber.startsWith("0789"));
//        System.out.println(st1.startsWith("ab"));
//        System.out.println();
//        System.out.println();
//        System.out.println("________");
//        //hàm so sánh endWith
//        String st2 = "Nguyễn Văn A";
//        System.out.println("hàm endWith so sánh chuỗi có kết thức bằng Văn A hay không: "+st2.endsWith("Văn A"));
    }
}

