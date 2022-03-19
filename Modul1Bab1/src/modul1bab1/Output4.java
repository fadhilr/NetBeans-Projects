/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1;

/**
 *
 * @author guest-bfTDfb
 */
public class Output4 {
    public static void main(String[] args) {
        float x = 7654.123456789F;
        System.out.printf("%d %3d %8d\n",1234,-567,8910);
        System.out.printf("%d %3d %+8d\n",1234,-567,8910);
        System.out.printf("%f %15f %15.3f\n" , x, x, x);
        System.out.printf("%.2f\n",x);
        System.out.printf("%g %15e %15.3f\n",x,x,x); 
        System.out.printf("%15g %15e %15.3f\n",x,x,x); 
    }
}
