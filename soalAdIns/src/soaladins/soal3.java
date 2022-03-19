/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

/**
 *
 * @author fadil
 */
public class soal3 {
    public static void main(String[] args) {
        int n=8;
        int x=0;
        int hasil=1;
        int temp=0;
        do{
            
            if (hasil==1) {
                System.out.print(1);
                System.out.print(" ");
            }else{
            System.out.print(hasil);
            System.out.print(" ");
            }
            hasil=hasil+x;
        }while((hasil+x)<=n);
    }
    
}
