/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java16;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  a,b;
        System.out.println("Nhap vao so a ");
        a = sc.nextDouble();
        System.out.println("Nhap vao so b ");
        b = sc.nextDouble();
        
        //Hàm trị tuyệt đối
        System.out.println( " |a| " + Math.abs(a));
        
        //Hàm tìm min
        System.out.println("min(a,b) = " + Math.min(a,b));
        
        //Hàm tìm max
        System.out.println("max(a,b) = " + Math.max(a, b));
        
        //Hàm ceil 
        System.out.println("ceil(a,b) = " + Math.ceil(a));
        
        //Hàm floor
        System.out.println("floor(a) = " + Math.floor(a));
        
        // Hàm căn bậc 2
        System.out.println("sqrt(a) = " + Math.sqrt(a));
        
        // Hàm tính a^b 
        System.out.println("a^b = " + Math.pow(a, b));
        
        
    }
}
