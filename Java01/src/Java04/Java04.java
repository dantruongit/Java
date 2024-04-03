package Java04;
public class Java04 {
    public static void main(String[] args) {
        String thongBao = "Xin chao";
        String hoVaTen = "Duong Van Tuan";
        String tenSach;
        tenSach = "Ban la cau nho cua to";
        System.out.println("Thong báo" + thongBao);
        System.out.println("Tên" + hoVaTen);
        System.out.println("Tên sách là :" + tenSach);
        int a = 1234;
        String z = a + "";
        //1 2   3   4
        //0 1   2   3
        // 3 = length - 1
        int length = z.length();
        String ketqua = String.valueOf(z.charAt(length - 1)) + String.valueOf(z.charAt(length - 2));
        System.out.println(ketqua);
        // abcd - > d
        // a * 1000 + b * 100 + c*10 + d
        // 0 + 0 + 0 + d
        // 
    }
}
