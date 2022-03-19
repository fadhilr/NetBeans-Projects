/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;


public class ASD extends SuperKelas{
    public String hitungHasil() {
       String hasil=String.valueOf(getTugas()/4+getKuis()/3+getUas()/4+getUts()/2);
       return hasil;
    }    
}
