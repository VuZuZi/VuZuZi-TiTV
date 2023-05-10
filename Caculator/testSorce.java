//package TITV_learning.Caculator;
//
//public class testSorce {
//    private static int nb1 = 0;
//    private static int toanHang = -1;
//
//    public void checkTH(String a){
//        if (toanHang == -1){
//            try {
//                nb1 = Integer.parseInt(a);
//            }catch (Exception e){
//                nb1 = nb1;
//            }
//        }else if (toanHang == 1){
//            try {
//                nb1 += Integer.parseInt(a);
//            }catch (Exception e){
//                nb1 = nb1;
//            }
//        }else if(toanHang == 2){
//            try {
//                nb1 -= Integer.parseInt(a);
//            }catch (Exception e){
//                nb1 = nb1;
//            }
//        }else if (toanHang ==3){
//            nb1 *=Integer.parseInt(a);
//        }
//        System.out.println(toanHang);add
//    }
//
//    public void addNumber(String add){
//        if (add.equals("+")){
//            this.checkTH(add);
//            toanHang = 1;
//            System.out.println(add);
//            System.out.println(toanHang);
//        }
//        if (add.equals("-")){
//            this.checkTH(add);
//            System.out.println(nb1);
//            toanHang = 2;
//            System.out.println(toanHang);
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
