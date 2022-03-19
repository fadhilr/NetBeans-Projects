/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

public class Probstat extends SuperKelas{
    public String hitungHasil() {
       String hasil=String.valueOf(getTugas()/2+getKuis()/5+getUas()/3+getUts()/3);
       return hasil;
    }    
}
