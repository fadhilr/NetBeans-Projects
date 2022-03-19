
package SistemPerpus;

import java.util.Scanner;

public class DaftarPetugas {
    
    private static String idPetugas[]=new String[10]; 
    private static String namaPetugas[]=new String[10]; 
    private static String alamat[]=new String[10]; 
    static int x=2;
    public DaftarPetugas(){
        idPetugas[0]="AS551";
        namaPetugas[0]="Partomin";
        alamat[0]="jl kartos";
        idPetugas[1]="AS552";
        namaPetugas[1]="Kemal";
        alamat[1]="jl matos";   
    }
    public static void inputPetugas(){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ID petugas\t=");
        idPetugas[x]=input.nextLine();
        System.out.print("Masukkan nama petugas\t=");
        namaPetugas[x]=input.nextLine();
        System.out.print("Masukkan alamat petugas\t=");
        alamat[x]=input.nextLine();
        x++;
    }
    public static void lihatPetugas(){
        for (int i = 0; i < x; i++) {
            System.out.println("ID petugas "+(i+1)+"\t="+idPetugas[i]);
            System.out.println("nama petugas "+(i+1)+"\t="+namaPetugas[i]);
            System.out.println("alamat petugas "+(i+1)+"\t="+alamat[i]);
            System.out.println("------------------------");
        }
    }
}
