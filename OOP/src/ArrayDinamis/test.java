
package ArrayDinamis;

import java.util.Scanner;


public class test {
    public static void main(String[] args) {
        int angka[] = new int[2];
        angka[0]=1;
        angka[1]=2;
        boolean a=true;
        Scanner in = new Scanner (System.in);
        do{
            System.out.println("1. tambah array");
            System.out.println("2. berhenti");
            int pilihan = in.nextInt();
            
            switch(pilihan){
                case 1 : {
                    int temp[] = new int [angka.length];
                    temp = angka;
                    angka = new int[temp.length+1];
                    for (int i = 0; i < temp.length; i++) {
                        angka[i] = temp[i];
                    }
                    System.out.println("masukkan tambahan:");
                    angka[angka.length-1]=in.nextInt();
                }break;
                case 2 : {
                    a=false;
                    for (int b : angka) {
                        System.out.println(b);
                    }
                }
            }
        }while(a);
        
    }
}
