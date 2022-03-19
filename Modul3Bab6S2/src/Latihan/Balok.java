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
public class Balok extends BangunRuang{
    private int panjang,lebar;
    public Balok(int tinggi, double volume){
        super(tinggi, volume);
    }
    public int luasPermukaan(int p, int l){
        int luas;
        panjang=p;
        lebar=l;
        luas=2*((p*l)+(p*getTinggi())+(l*getTinggi()));
        return luas;
    }
    
}
