/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohprojectn;

/**
 *
 * @author U53R
 */
public class EkspresiOperator {
    public static void main(String[] args) {
        int a=5;
        int b=10/++a + ++a*++a;
        System.out.println("b1:"+b);
        System.out.println("a1:"+a);
        a=5;
        b= 10/++a + ++a*a++;
        System.out.println("b2:"+b);
        System.out.println("a2:"+a);     
        
    }
}
