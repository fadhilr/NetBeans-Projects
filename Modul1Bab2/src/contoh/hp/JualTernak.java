package contoh.hp;

import java.util.Scanner;

public class JualTernak {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int ayam= 100000,
             sapi= 5000000,
             kambing= 2000000;
        int ay, sa, ka;
        String nama;
        System.out.println("==================Penjualan Ternak====================");
        System.out.print("Masukkan nama\t\t\t:");
        nama= input.nextLine();
        System.out.print("Jumlah ayam yang dibeli\t\t:");
        ay= input.nextInt();
        System.out.print("Jumlah kambing yang dibeli\t:");
        ka= input.nextInt();
        System.out.print("Jumlah sapi yang dibeli\t\t:");
        sa= input.nextInt();
        
        int harga1= (sapi*sa),
            harga2= (kambing*ka),
            harga3= (ayam*ay);
            
        
        if (sa!=0 && sa%2==0) {
            System.out.println("Harga ayam\t\t\t:"+harga3);
            System.out.println("Harga kambing\t\t\t:"+harga2);
            harga1= (int) ((1-0.1)*sapi*sa);
            System.out.println("Harga sapi\t\t\t:"+harga1);
            
        } else if (ka%2==1) {
            System.out.println("Harga ayam\t\t\t:"+harga3);
            harga2= (int) ((1-0.2)*kambing*ka);
            System.out.println("Harga kambing\t\t\t:"+harga2);
            System.out.println("Harga sapi\t\t\t:"+harga1);
            
        } else if (ay%3==0) {
            harga3= (int) ((1-0.2)*ayam*ay);
            System.out.println("Harga ayam\t\t\t:"+harga3);
            System.out.println("Harga kambing\t\t\t:"+harga2);
            System.out.println("Harga sapi\t\t\t:"+harga1);
            
        } else {
            System.out.println("Harga ayam\t\t\t:"+harga3);
            System.out.println("Harga kambing\t\t\t:"+harga2);
            System.out.println("Harga sapi\t\t\t:"+harga1);
        }    
        System.out.println("Total Harga\t\t\t:"+(harga1+harga2+harga3));
       
                
    }
}
