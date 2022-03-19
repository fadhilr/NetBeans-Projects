/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

public class LatihanArray2Dimensi {
    public static void main(String[] args) {
        int matriks[][]=new int [4][5];
        int a=1;
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j]=a;
                if (a>9) {
                    System.out.print("  "+a);
                } else {
                    System.out.print("   "+a);
                }
                a++;
            }
            System.out.println("");
        }
    }
}
