/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;

/**
 *
 * @author ACER OWN
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double tugas, kuis, uas, akhir ;
        
        System.out.println ("Masukkan nilai tugas\t: ");
        tugas = input.nextDouble ();
        System.out.println("Masukkan nilai kuis\t: ");
        kuis = input.nextDouble();
        System.out.println("Masukkan nilai UAS\t: ");
        uas = input.nextDouble();
        
        if (kuis>uas){
            akhir = 0.4 * kuis + 0.4 * uas + 0.2 * tugas;}
        else { akhir = 0.3 * kuis + 0.5 * uas + 0.2 * tugas;}
        
        System.out.println("Nilai akhir\t= "+akhir);
        
    }
    
}
