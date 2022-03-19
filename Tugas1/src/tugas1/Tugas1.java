/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author ACER OWN
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double ip ;
        
        
        System.out.println("Masukkan nilai\t: ");
        ip = input.nextDouble();
        
        if (ip>4){
            System.out.println("ERROR !!!");}
        else if (ip >= 3.51){ 
            System.out.println("Sangat memuaskan");}
        else if (ip >= 2.76){
            System.out.println("Memuaskan");}
        else if (ip >= 2){
            System.out.println("Baik");}
        else {System.out.println("Kurang");
            
        }
    }
    
}
