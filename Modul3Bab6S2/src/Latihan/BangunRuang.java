/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class BangunRuang {
    private int tinggi;
    private double volume;
    
    public BangunRuang(int t,double v){
        tinggi=t;
        volume=v;
    }
    public double luasPenampang(){
        double luas;
        luas=volume/tinggi;
        return luas;
    }
    public int getTinggi(){
        return tinggi;
    }
}
