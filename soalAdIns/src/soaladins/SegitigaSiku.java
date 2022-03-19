/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

/**
 *
 * @author fadil
 */
public class SegitigaSiku {
    public static void main(String[] args) {
        int n =5;
        int x =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            x=x+2;
            System.out.println("");
        }
    }
}
