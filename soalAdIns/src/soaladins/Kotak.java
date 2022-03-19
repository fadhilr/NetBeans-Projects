/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author fadil
 */
public class Kotak {
    public static void main(String[] args) {
        int n=5;
        int x=8;
        for (int i=0;i<5;i++) {
            for(int j=0;j<8;j++){
                if (j==(x-1)||i==(n-1)||j==0||i==0) {
                    System.out.print("*");
                }else{
                System.out.print(" ");
                }
//                
            }
            System.out.println("");
        }
    }
}
