/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java15;

import java.util.Scanner;

/**
 *
 * @author BOSS PC
 */
public class Java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a =");
        int a = sc.nextInt();
        
        String ketQua= (a%2==0)?" So chan ":" So le ";
        System.out.println(a + " la " + ketQua);
    }
}
