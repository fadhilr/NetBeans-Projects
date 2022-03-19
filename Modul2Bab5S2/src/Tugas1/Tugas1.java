/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;
public class Tugas1 {
    public static void penjumlahan(int a, int b){
        int jum;
        jum=a+b;
        System.out.println("Hasil jumlah = "+jum);
    }
    public static void pengurangan(int a, int b){
        int jum;
        jum=a-b;
        System.out.println("Hasil pengurangan = "+jum);
    }
    public void perkalian(int a, int b){
        int jum;
        jum=a*b;
        System.out.println("Hasil perkalian = "+jum);
    }
    public void pembagian(int a, int b){
        int jum;
        jum=a/b;
        System.out.println("Hasil pembagian = "+jum);
    }
    public void sederhana(int a, int b){
        int temp, A, B;
        if (b == 0) {
            return;
        }
        A = (a < b) ? b : a;
        B = (a < b) ? a : b;
        while(B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        a /= A;
        b /= A;
        System.out.println("Hasil sederhana pecahannya = "+a+"/"+b);
    }
}
