/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author U53R
 */
public class Tabung extends BangunRuang{
    public Tabung (int tinggi, double volume){
        super(tinggi,volume);
    }
    public double jari(){
        double jari;
        jari= Math.sqrt(luasPenampang()/3.14);
        return jari;
    }
    public double luasPermukaan(){
        double luas;
        luas=(2*3.14*jari())*(jari()+getTinggi());
        return luas;
    }
}
