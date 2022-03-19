/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester1bab2;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class nomor1 {
    public static void main(String[] args) {
        int p,l,t,r;
        Scanner input= new Scanner(System.in);
        System.out.println("1. menghitung luas dan keliling persegi panjang");
        System.out.println("2. menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("pilihan anda : ");
        int pilih=input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Masukkan panjang \t: ");
                p=input.nextInt();
                System.out.print("Masukkan lebar \t: ");
                l=input.nextInt();
                int kelilingpp=(2*p)+(2*l);
                int luaspp=p*l;
                System.out.println("Keliling persegi panjang \t: "+kelilingpp+" cm2");
                System.out.println("Luas persegi panjang \t: "+luaspp+" cm");
                break;
            case 2:
                double pi=3.14;
                System.out.println("Masukkan jari-jari\t: ");
                r=input.nextInt();
                int kelilingl=(int) (2*pi*r);
                int luasl=(int) (pi*r*r);
                System.out.println("Keliling persegi panjang \t: "+kelilingl+" cm2");
                System.out.println("Luas persegi panjang \t: "+luasl+" cm");
                break;
            case 3:
                System.out.println("Masukkan a\t: ");
                int a=input.nextInt();
                System.out.println("Masukkan b\t: ");
                int b=input.nextInt();
            default:
                throw new AssertionError();
        }
    }
}
