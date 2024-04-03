/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java13;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float a;
        System.out.println("Nhap vao so a = " );
        //Các phép gán
        a = sc.nextFloat();
        System.out.println("a = " + a);
        a+=3; // a = a + 3; = a= a + 3 
        System.out.println("a+= 3 : " +a);
        a-=2; // a = a - 2;
        System.out.println("a-= 2 : " +a);
        a*=2; // a = a * 2;
        System.out.println("a*= 2 : " +a);
        a/=2; // a = a / 2;
        System.out.println("a/= 2 : " +a);
        a%=2; // a = a%2;
        System.out.println("a%= 2 : " +a);
        
    }
}
