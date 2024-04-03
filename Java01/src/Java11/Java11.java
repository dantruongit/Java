/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java11;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java11 {
    public static void main(String[] args) {
        //khai báo biến
        int a,b;
        
        // nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao a= ");
        a = sc.nextInt();
        System.out.println("Nhap vao b= ");
        b = sc.nextInt();
        
        int tong = a+ b;
        System.out.println(a+ "+" +b+"="+tong);
        
        int hieu = a-b;
        System.out.println(a+ "-" +b+"="+hieu);
        
        int nhan = a*b;
        System.out.println(a+ "*" +b+"="+nhan);
        
        float chia = (float) a/b;
        System.out.println(a+ "/" +b+"="+chia);
        
        int chiaDu = a%b;
        System.out.println(a+ "%" +b+"="+chiaDu);



    }
}
