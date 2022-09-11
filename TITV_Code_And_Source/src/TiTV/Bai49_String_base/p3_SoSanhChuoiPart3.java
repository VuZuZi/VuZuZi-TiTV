package TiTV.Bai49_String_base;

public class p3_SoSanhChuoiPart3 {
    public static void main(String[] args) {
        String s1 = "I am Vu, Hello everybody";
        String s2 = "I am Vu";
        String s3 = "everybody";
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(i+" : "+s1.charAt(i));
        }
        // Hàm indexOf()
        System.out.println("Vị trí s2 trong chuỗi s1 là: " + s1.indexOf(s2));
        System.out.println("Vị trí s3 trong chuỗi s1 là: " + s1.indexOf(s3));

        // sử dụng vị trí bắt đầu
        System.out.println("Vị trí s2 trong chuỗi s1 bắt đầu từ vị trí 2 là: " + s1.indexOf(s2,2));

        char c1 = 'e';
        System.out.println("Vị trí c1 đầu tiên trong chuỗi s1 là: " + s1.indexOf(c1));
        System.out.println("Vị trí e bắt đầu từ vị trí 13 của chuỗi s1 là: "+s1.indexOf(c1,13));
        // LastIndexOf
        System.out.println("------------");
        System.out.println("lastIndexOf tìm kiếm từ phải sang trái");

        System.out.println("Vị trí s2 trong chuỗi s1 lastIndexOf là: " + s1.lastIndexOf(s2));
        System.out.println("Vị trí s3 trong chuỗi s1 lastIndexOf là: " + s1.lastIndexOf(s3));
        System.out.println("Vị trí c1 đầu tiên trong chuỗi s1 lastIndexOf là: " + s1.lastIndexOf(c1));

    }
}
