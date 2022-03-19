/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utppemlan;

import java.util.Scanner;


public class UTP1 {
    static String nama, usia, status;
    private int jamkerja,gaji,banding;
    
    
    public UTP1(String s){
        status= s;
    }
    public void setPegawai(String n, String u, int j){
        nama=n;
        usia=u;
        jamkerja=j;
    }
    public int getGaji(){
        if (status.equalsIgnoreCase("pegawai paruh waktu")) {
            gaji=jamkerja*10000;
        } else if(status.equalsIgnoreCase("pegawai tetap")){
            if (jamkerja>=8) {
                gaji=(jamkerja*100000/24)+20000;
            } else {
                gaji=jamkerja*100000/24;
            }
        }
        return gaji;
    }
    public void banding(){
        banding=gaji-gaji;
    }
    public void setDisplay(){
        System.out.println("Nama pegawai : "+nama);
        System.out.println("usia pegawai : "+usia);
        System.out.println("status pegawai : "+status);
        System.out.println("jamkerja pegawai(jam) : "+jamkerja);
        System.out.println("gaji pegawai: "+getGaji());
    }
}
