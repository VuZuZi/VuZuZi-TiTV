package TITV_learning.Code.Bai65_CauTrucMapTuDien;

import java.util.*;

public class TestMap {
    public static class TuDien{
//        private Map<String,String> duLieu = new TreeMap<String,String>(); // có sắp xếp theo thứ tự aphal
        private Map<String,String> duLieu = new HashMap<>(); // không sắp xếp theo thứ tự khi truyền dữ liệu vào

//        public TuDien(Map<String, String> duLieu) {
//        } //auto có 1 constractur rỗng

        public String themTu(String tuKhoa, String yNghia){
            return this.duLieu.put(tuKhoa,yNghia);
        }

        public String xoaTu(String tuKhoa){
            return this.duLieu.remove(tuKhoa);
        }

        public String yNghia(String tuKhoa){
            return this.duLieu.get(tuKhoa);
        }

        public void inDanhSach(){
            Set<String> tapHopTuKhoa = this.duLieu.keySet();
            System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
        }
        public void inSoLuong(){
            System.out.println("trong từ điển có "+this.duLieu.size());
        }
        public void xoaTatCa(){
            this.duLieu.clear();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        TuDien tuDien = new TuDien();
        String tk;

        do {
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println("Menu (từ điển)");
            System.out.println("1: Thêm từ (Key-Value)");
            System.out.println("2: Xóa dữ liệu theo từ khóa");
            System.out.println("3: Tìm ý nghĩa của từ khóa");
            System.out.println("4: In ra danh sách các từ");
            System.out.println("5: In ra số lượng từ");
            System.out.println("6: Xóa tất cả các từ khóa");
            System.out.print("nhập lựa chọn của bạn: ");
            luaChon = Integer.parseInt(sc.nextLine());
            switch (luaChon){
                case 1:
                    System.out.print("nhập Ký tự: ");
                    tk = sc.nextLine();
                    System.out.print("nhập dữ liệu: ");
                    String duLieu = sc.nextLine();
                    tuDien.themTu(tk,duLieu);
                        break;
                case 2:
                    System.out.print("nhập ký tự muốn xóa: ");
                    tk = sc.nextLine();
                    tuDien.xoaTu(tk);
                    break;
                case 3:
                    System.out.print("ký tự: ");
                    tk = sc.nextLine();
                    System.out.println(tk+": "+tuDien.yNghia(tk));
                    break;
                case 4:
                    tuDien.inDanhSach();
                        break;
                case 5:
                    tuDien.inSoLuong();
                    break;
                case 6: 
                    tuDien.xoaTatCa();
            }
        }while (luaChon!=0);
    }
}
