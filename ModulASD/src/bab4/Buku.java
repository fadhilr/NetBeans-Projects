/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

public class Buku {
    private String judul;
    private String pengarang;
    public Buku(String jdl, String peng) {
        this.judul = jdl;
        this.pengarang = peng;
    }
    public String toString() {
        return String.format("%s %s", this.judul, this.pengarang);
    }
}
