/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java09;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ho va ten");
        String hoVaTen = sc.nextLine();
        
        System.out.println("Nhap ma sinh vien");
        long maSinhVien = sc.nextLong();
        
        System.out.println("Nhap diem thi");
        float diemThi = sc.nextFloat();
        
        System.out.println("Ho va ten la " + hoVaTen);
        System.out.println("Ma Sinh Vien La " + maSinhVien);
        System.out.println("Diem thi cua ban la " + diemThi);

        
        
    }
}
