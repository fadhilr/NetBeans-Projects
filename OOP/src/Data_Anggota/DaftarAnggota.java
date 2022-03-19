/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Anggota;

import java.util.Scanner;
public class DaftarAnggota {
    static Scanner input=new Scanner(System.in);
    private static String idAnggota[]=new String[10]; 
    private static String namaAnggota[]=new String[10]; 
    private static String alamat[]=new String[10]; 
    static int x=2;
    public DaftarAnggota(){
        idAnggota[0]="A551";
        namaAnggota[0]="Karimun";
        alamat[0]="jl kalong";
        idAnggota[1]="A552";
        namaAnggota[1]="Hamdalun";
        alamat[1]="jl raya";
    }
    public static void inputAnggota(){
        
        System.out.print("Masukkan ID anggota \t=");
        idAnggota[x]=input.nextLine();
        System.out.print("Masukkan nama anggota\t=");
        namaAnggota[x]=input.nextLine();
        System.out.print("Masukkan alamat anggota\t=");
        alamat[x]=input.nextLine();
        
        x++;
    }
    public static void lihatAnggota(){
        for (int i = 0; i < x; i++) {
            System.out.println("ID angoota "+(i+1)+"\t="+idAnggota[i]);
            System.out.println("nama angoota "+(i+1)+"\t="+namaAnggota[i]);
            System.out.println("alamat angoota "+(i+1)+"\t="+alamat[i]);
            System.out.println("------------------------");
        }
    }
}
