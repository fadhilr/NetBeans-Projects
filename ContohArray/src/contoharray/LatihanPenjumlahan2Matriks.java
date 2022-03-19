
package contoharray;

import java.util.Scanner;

public class LatihanPenjumlahan2Matriks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ordo = ");
        int n=input.nextInt();
        System.out.println("ordo "+n+"x"+n);
        int matriksA[][]=new int [n][n];
        int matriksB[][]=new int [n][n];
        int matriks[][]=new int [n][n];
        System.out.println("Matriks A :");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print("Matriks ["+i+"] ["+j+"] =");
                matriksA[i][j]=input.nextInt();
            }
            
        }
        System.out.println("Matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print("Matriks ["+i+"] ["+j+"] =");
                matriksB[i][j]=input.nextInt();
            }
            
        }
        System.out.println("Hasil penjumlahan kedua matriks :");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                matriks[i][j]=matriksA[i][j]+matriksB[i][j];
                if (matriks[i][j]>9) {
                    System.out.print("  "+matriks[i][j]);
                } else {
                    System.out.print("   "+matriks[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
