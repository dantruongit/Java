/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java14;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a = ");
        a = sc.nextInt();
        System.out.println("Nhap b = ");
        b = sc.nextInt();
        
        //Xuất kết quả so sánh 
        System.out.println(a + " = " + b + ":" + (a==b) );
        System.out.println(a + " != " + b + ":" + (a!=b) );
        System.out.println(a + " < " + b + ":" + (a<b) );
        System.out.println(a + " > " + b + ":" + (a>b) );
        System.out.println(a + " >= " + b + ":" + (a>=b) );
        System.out.println(a + " <= " + b + ":" + (a<=b) );
        System.out.println("---------------------------");
        System.out.println("Ca hai la so chan " + (a%2==0 && b%2==0));       
        System.out.println("Co it nhat 1 so chan " + (a%2==0 || b%2==0)); 
        System.out.println("Ca hai la so le "+ (a%2 !=0 && b%2 !=0) );
        System.out.println("Co it nhat 1 so le "+ (a%2 !=0 || b%2 !=0) );



    }
}
