/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP2;


import java.util.Scanner;
public class DaftarAnggota {
    static Scanner input=new Scanner(System.in);
    private static String namaAnggota[]=new String[10]; 
    private static String alamat[]=new String[10]; 
    static int x=0;
    public DaftarAnggota(){
        
    }
    public static void inputAnggota(){
        System.out.print("Masukkan nama mahasiswa\t=");
        namaAnggota[x]=input.nextLine();
        System.out.print("Masukkan alamat mahasiswa\t=");
        alamat[x]=input.nextLine();
        System.out.println("-------------------------");
        x++;
    }
    public static void lihatAnggota(){
        for (int i = 0; i < x; i++) {
            System.out.println("nama angoota "+(i+1)+"\t="+namaAnggota[i]);
            System.out.println("alamat angoota "+(i+1)+"\t="+alamat[i]);
            System.out.println("------------------------");
        }
    }
}

