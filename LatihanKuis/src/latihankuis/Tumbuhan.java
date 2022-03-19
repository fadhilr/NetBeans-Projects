/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankuis;

public class Tumbuhan {
    private int umur,panen;
    private String jenis;
    static int banyak;
    public Tumbuhan(int u, String j){
        umur=u*12;
        jenis=j;
        banyak++;
    }
    public void setPanen(){
        if (jenis.equalsIgnoreCase("buah")) {
            panen= (umur-5)/3;
        } else if (jenis.equalsIgnoreCase("sayur")) {
            panen=(umur-2)/4;
        }
        System.out.println("Banyak panen : "+panen+" kali");
        System.out.println("");
    }
}
