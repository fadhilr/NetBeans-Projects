    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

public class LatihanFaktorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai=");
        int a=input.nextInt();
        
        faktorial(a);
  
    }
    static int faktorial(int a){
        for (int i = a; i > 1; i--) {
            System.out.print(i+"!");
            int jumlah = a*i;
            
        }
        return a;
        
    } 
    
}
