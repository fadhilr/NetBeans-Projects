/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

public class Matkomlan extends SuperKelas{
    public String hitungHasil() {
       String hasil=String.valueOf(getTugas()/5+getKuis()/2+getUas()/4+getUts()/2);
       return hasil;
    }    
}
