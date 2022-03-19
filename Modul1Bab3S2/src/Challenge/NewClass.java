/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

import java.util.*;


public class NewClass {
    static int nim[] = {};
    static String nama[] = {};
    static String hobi[] = {};
    private static boolean a=true;
    
    public static void tambahData(){
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        int temp[] = new int [nim.length];
        String temp1[] = new String [nama.length];
        String temp2[] = new String [hobi.length];
                    temp = nim;
                    temp1 = nama;
                    temp2 = hobi;
                    nim = new int[temp.length+1];
                    nama = new String[temp1.length+1];
                    hobi = new String[temp2.length+1];
                    for (int i = 0; i < temp.length; i++) {
                        nim[i] = temp[i];
                        nama[i]=temp1[i];
                        hobi[i]=temp2[i];
                    }
                    System.out.print("NIM : ");
                    nim[nim.length-1]=input.nextInt();
                    System.out.print("Nama : ");
                    nama[nama.length-1]=input1.nextLine();
                    System.out.print("Hobi : ");
                    hobi[hobi.length-1]=input1.nextLine();
                    tampil();
    }
    public static void tampil(){
        System.out.println("||NIM\t\tNAMA\t\tHobi ||");
        for (int i = 0; i < nim.length; i++) {
            for (int j = 0; j < nim.length; j++) {
                if (nim[i]<nim[j]) {
                    int sem=nim[i];
                    String sem1=nama[i];
                    String sem2=hobi[i];
                    nim[i]=nim[j];
                    nama[i]=nama[j];
                    hobi[i]=hobi[j];
                    nim[j]=sem;
                    nama[j]=sem1;
                    hobi[j]=sem2;
                }
            }
        }
        for (int i = 0; i < nim.length; i++) {
            System.out.println("||"+nim[i]+"\t\t"+nama[i]+"\t\t"+hobi[i]+" ||");
        }
        System.out.println("");
    }
}
