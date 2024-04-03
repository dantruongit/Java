/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java10;

/**
 *
 * @author BOSS PC
 */
public class Java10 {

    public static void main(String[] args) {
        // đây là ép kiểu ngầm định

        int a = 100;
        int b = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        float c = (float) a;
        float d = (float) b;
        System.out.println("c= " + a);
        System.out.println("d= " + b);
        
        // đây là ép kiểu tường minh
        
        float e = 3.5f;
        float f = 9.5f;
        
        System.out.println("e= "+e);
        System.out.println("f= "+f);
        
        int g=(int)e;
        int h=(int)f;
        
        System.out.println("g= "+g);
        System.out.println("h= "+h);
        
        //đây là ép kiểu giữa biến nguyên thủy và đối tượng 
        int x = new Integer(34);
        System.out.println("x = "+x);
            

    }
}
