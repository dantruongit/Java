
package Java16;

import java.util.Scanner;

public class BaiTapHinhTron { 
    // Tính diện tích và chu vi của hình tròn khi biết bán kính R được nhập từ bàn phím 
    public static void main(String[] args) {
        double r, dienTich , chuVi;
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhap ban kinh r : ");
        r = sc.nextDouble();
        
        //Tính chu vi hình tròn = 2 * r * PI 
        chuVi = 2*r*Math.PI;
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Chu vi = " + Math.round(chuVi));
        // Vd muốn lấy cả 2 số phẩy ở dưới khi làm tròn cta sd phép tính *100 và /100
        System.out.println("Chu vi = " + Math.round(chuVi*100)/100.0);

        
        //Tính diện tích hình tròn = PI(r^2)
        dienTich = Math.PI * Math.pow(r,2);
        System.out.printf("Dien tich = %.2f\n" , dienTich );
        //%d so nguyen
        // %f : so thuc, so douBBLE
        // %s : chuoi string
        // ptint lỉn
        //printf = print format
        System.out.println("Dien tich = " + dienTich);
        System.out.println("Dien tich = " + Math.round(dienTich));
        System.out.println("Dien tich = " + Math.round(dienTich*100)/100.0);
        
    }
}
