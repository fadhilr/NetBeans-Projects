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
public class Limas extends BangunRuang {
    public Limas(int tinggi,double volume ){
        super(tinggi,volume);
    }
    public double luasPenampang() {
        return super.luasPenampang()*3;
    }
    public double luasPermukaan(){
        double luas;
        luas=luasPenampang()+(3*1/2*1/3*getTinggi()*getTinggi());
        return luas;
    }
}
