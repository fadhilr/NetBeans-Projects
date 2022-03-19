/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musik;

/**
 *
 * @author U53R
 */
public class Harmonika extends MusikTiup{
    @Override
    public void tampilkanNama() {
        System.out.println("===Harmonika===");
    }
    @Override
    public void tampilkanBahan() {
        System.out.println("Terbuat dari Plastik atau logam");
    }
    @Override
    public void nadaDasar() {
        System.out.println("C=do ,D=re ,E=mi ,F=fa ,G=sol ,A=la ,B=si");
    }
}

