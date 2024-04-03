package java03;

import java.util.Scanner;

public class Java03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter\n");
        System.out.println("Nhap chung minh thu");
        long chungMinhThu = sc.nextLong();
        //int, long, double
        //12345     \n
        //
        sc.nextLine();
        System.out.println("Nhap ho va ten");
        String hoVaTen = sc.nextLine();
        
        System.out.println("Chung minh thu cua ban la " + chungMinhThu);
        System.out.println("Ho va ten cua ban la " + hoVaTen);

        
//        x = 100; =>> sẽ bị báo lỗi nếu mình cố tình thay đổi hằng số x
/* alo
alo
alo
*/
/**
 * @author windown 10
 * 
 */
    }
}
