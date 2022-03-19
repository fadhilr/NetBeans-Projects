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
public class X_DalamKotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=10;
        for (int i=0;i<n;i++) {
//                if(n==i){
//                    System.out.print("*");
//                }
            for(int j=0;j<n;j++){
                if (j==i||j==(n-1)||i==(n-1)||j==0||i==0||j==((n-1)-i)) {
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
