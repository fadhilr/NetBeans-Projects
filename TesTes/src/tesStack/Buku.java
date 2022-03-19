/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesStack;

public class Buku {

    private String judul, pengarang;
    private int top, size;
    private Object[] data;

    public Buku(int n) {
        top = -1;
        size = n;
        data = new Object[size];
    }

    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    @Override
    public String toString() {
  return String.format("%s %s", this.judul, this.pengarang);
    }
}
