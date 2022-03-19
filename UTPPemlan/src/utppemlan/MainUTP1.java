/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utppemlan;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class MainUTP1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        UTP1 pegawai=new UTP1("pegawai paruh waktu");
        UTP1 pegawai1=new UTP1("pegawai tetap");
        pegawai.setPegawai("Andi", "18", 20);
        pegawai1.setPegawai("iman", "19", 25);
        pegawai.setDisplay();
        pegawai1.setDisplay();
        pegawai.banding();
    }
}
