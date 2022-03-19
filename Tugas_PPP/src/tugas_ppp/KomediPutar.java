/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;


class KomediPutar implements Gedung {

    public void accept(JatimParkVisitor hv) {
        hv.visit(this);
    }

    public String getKomediPutar() {
        return " Komedi Putar";
    }
}