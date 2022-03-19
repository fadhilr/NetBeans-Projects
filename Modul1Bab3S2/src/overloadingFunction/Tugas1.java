/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloadingFunction;
public class Tugas1 {
    private static String angka[]={"nol","satu","dua","tiga","empat",
                "lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public static void overloadingMeth(String huruf){
        int hasil=0;
        String data[]=huruf.toLowerCase().split(" ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < angka.length; j++) {
                if (data[i].equalsIgnoreCase(angka[j])) {
                    hasil+= j;
                } else if (data[i].equalsIgnoreCase("belas")) {
                    hasil+=10;
                    break;
                } else if (data[i].equalsIgnoreCase("puluh")) {
                    hasil*=10;
                    break;
                } else if (data[i].equalsIgnoreCase("seratus")) {
                    hasil=100;
                    break;
                } 
            }
        }
        System.out.println("Kata dalam bentuk bilangan = "+hasil);
        System.out.println("================================");
    }
    public static void overloadingMeth(int ang){
        String hasil="";
        int baru=0;
        for (int i = 0; i < angka.length; i++) {
            if (ang==0) {
                hasil=angka[i];
                System.out.println("Hasil angka dalam bentuk kata = "+hasil);
                break;
            } else if (ang<=11) {
                hasil=angka[ang];
                System.out.println("Hasil angka dalam bentuk kata = "+hasil);
                break;
            } else if (ang<20) {
                hasil=angka[ang-10];
                System.out.println("Hasil angka dalam bentuk kata = "+hasil+
                        " belas");
                break;
            } else if (ang/10<10) {
                baru=ang%10;
                hasil=angka[ang/10];
                System.out.println("Hasil angka dalam bentuk kata = "+hasil+
                        " puluh "+angka[baru]);
                break;
            }  else if (ang==100) {
                hasil="seratus";
                break;
            } else {
                System.out.println("Angka yang dimasukkan error");
            }
        }
        System.out.println("================================");
    }
}

    
    

