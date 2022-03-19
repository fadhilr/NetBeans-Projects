/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

public class LatihanArrayPerkalian {

    public static void main(String[] args) {
        {
            int A[][] = {{1, 2}, {4, 5}};
            int B[][] = {{3, 1}, { 2, 6}};
            int C[][];
            int i, j, k;
            C = new int[A.length][B.length];
            System.out.println("Matrix A");
            for (i = 0; i < C.length; i++) {
                for (j = 0; j < C[0].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix B");
            for (i = 0; i < C.length; i++) {
                for (j = 0; j < C.length; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Matrix A X Matrix B ");
            for (i = 0; i < C.length; i++) {
                for (j = 0; j <C.length; j++) {
                    C[i][j] = 0;
                    for (k = 0; k <C.length; k++) {
                        C[i][j] = C[i][j] + A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

}
