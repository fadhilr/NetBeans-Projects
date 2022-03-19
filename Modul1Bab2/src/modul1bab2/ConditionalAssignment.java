/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab2;

import java.util.Scanner;

public class ConditionalAssignment {
    public static void main(String[] args){
        
        String s = "filkom";
        String val= s=="filkom"?"Brawijaya" : "null";
        System.out.println(s+" "+val);
        Scanner input=new Scanner (System.in);
        String nama,nama1,sandi,sandi1,name,password;
        System.out.print("Masukkan nama\t\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan password\t: ");
        sandi =input.nextLine();
        System.out.print("Ketik ulang nama\t: ");
        nama1 = input.nextLine();
        System.out.print("Ketik ulang password\t: ");
        sandi1 = input.nextLine();

        name = nama.equals(nama1) ? nama1 : "Data tidak ditemukan";
        System.out.println("Nama\t\t\t: "+name);
        password = sandi.equals(sandi1) ? sandi1 : "Data tidak ditemukan"; 
        System.out.println("Password\t\t: "+password);
    }
} 

        
        
//        Scanner input=new Scanner(System.in);
//        System.out.print("Masukkan nama\t:");
//        nama= input.nextLine();
//        System.out.print("Masukkan NIM\t:");
//        nim= input.nextLine();
//        val2= nama.equalsIgnoreCase("Fadhil")?"Fadhil":"input nama salah";
//        System.out.println(val2);
//        val3= nim.equalsIgnoreCase("155150201111227")?"155150201111227": "input nim salah";
//        System.out.println("NIM"+val3);
//        
//    }
//}
    