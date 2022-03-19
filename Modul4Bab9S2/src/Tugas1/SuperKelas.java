/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;


public abstract class SuperKelas {
    private int tugas;
    private int kuis;
    private int uts;
    private int uas;
    public void setTugas(String tugas) {
        this.tugas=Integer.parseInt(tugas);
    }
    public void setKuis(String kuis) {
        this.kuis=Integer.parseInt(kuis);
    }
    public int getTugas() {
        return tugas;
    }
    public int getKuis() {
        return kuis;
    }
    public int getUts() {
        return uts;
    }
    public int getUas() {
        return uas;
    }
    public void setUTS(String UTS) {
        this.uts=Integer.parseInt(UTS);
    }
    public void setUAS(String UAS) {
        this.uas=Integer.parseInt(UAS);
    }
    public abstract String hitungHasil();
}
