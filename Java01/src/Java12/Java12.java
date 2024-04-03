/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java12;

/**
 *
 * @author BOSS PC
 */
public class Java12 {
    public static void main(String[] args) {
        int a = 5;
        int d = 10;
        boolean b = false;
        int c = a++ + ++a + --d + d++ + d;
        //      5   + 7     + 9 + 9 + 10
        System.out.println(c);
        System.out.println(" +a => gia tri: " + (+a));
        System.out.println(" -a => gia tri: " + (-a));
        System.out.println(" !b => gia tri: " + (!b));
        System.out.println("----------------------");
        System.out.println("++a => " + (++a)); // cộng luôn khi xuất ra biến 
//        System.out.println("a++ => " + (a++)); // xuất ra biến rồi mới cộng 
        System.out.println("a = " +a);
        System.out.println("--a => " + (--a));
        System.out.println("a-- => " + (a--));
        System.out.println("a= " + a);
        
    }
}
