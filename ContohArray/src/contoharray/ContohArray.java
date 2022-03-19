/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;


public class ContohArray {


    public static void main(String[] args) {
//        int angka[]=new int [10];
//        for (int i = 0; i < angka.length; i++) {
//            angka[i]=0+i;
//        }
////        angka=new int[10];
////        int a=2;
////        for (int i = 0; i <angka.length; i++) {
////            angka[i]=a;
////            a+=2;
////            System.out.println(angka[i]);
////        }
//        System.out.println(angka[2]);
        int x=1;
        int matriksA[][]= new int [3][3];
        int matriksB[][]= new int [3][3];
        int hasil[][]=new int [3][3];
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[0].length; j++) {
                matriksA[i][j]=x;
                x++;
            }
        }
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[0].length; j++) {
                matriksB[i][j]=x-1;
                x--;
            }
        }
        
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksB[0].length; j++) {
                hasil[i][j]=matriksA[i][j]+matriksB[i][j];
                System.out.print(" "+hasil[i][j]);
            }
            System.out.println("");
        }
        
    }
}
