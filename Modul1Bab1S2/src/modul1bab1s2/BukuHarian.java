/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

public class BukuHarian {
    private int lembar;
    private int halaman;
    private int hari;
    private int hari50;   
    public void lembar(int i){
        lembar = i;
    }
    public void halaman(int i){
        halaman = i;
    }
    public void hari(int i){
        hari = i;
    }
    public void menghitungBanyakHari (){
        hari50 = lembar*hari/halaman;        
    }
    public void display(){
        String x;
        System.out.println("lama hari yang diselesaikan adalah: "+hari50);
    }}
