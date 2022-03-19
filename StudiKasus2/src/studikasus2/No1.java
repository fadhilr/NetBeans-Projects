/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class No1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan panjang data array= ");
        int n=input.nextInt();
        int data[]=new int[n];
        for (int i = 0; i < data.length; i++) {
            data[i]=input.nextInt();
        }
        Arrays.sort(data);
        System.out.println("Mean\t = "+mean(data));
        System.out.println("Median\t = "+median(data));
        
    }
    static double mean(int []data){
        int mean1=0;
        for (int i = 0; i < data.length; i++) {
            mean1+=data[i];
        }
        mean1= mean1/data.length;
        return mean1;
    }
    static String median(int []data){
        int median1=0;
        String hasil1;
        double hasil[]={};
        if (data.length%2==1) {
            median1=data.length/2;
            hasil1 = String.valueOf(data [median1]);
            return hasil1;
        }else{
            median1=data.length/2;
            hasil1 = String.valueOf((data [median1]+data[median1-1])/2.0);
            return hasil1;
        }
        
    }
    static void simpanganRerata(int[]data){
        int hasil;
        mean(data);
        for (int i = 0; i < data.length; i++) {
            hasil=(int) (data[i]-mean(data));
        }
    }
//    static void modus(int[]data){
//        for (int i = 0; i < data.length; i++) {
//            if () {
//                
//            } else {
//            }
//        }
//    }
    
}
